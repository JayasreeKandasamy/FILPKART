package com.training.FilpkartClone.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.FilpkartClone.model.Customer;
import com.training.FilpkartClone.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
  private CustomerRepository custRepo;
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomer (@PathVariable int id){
		Optional<Customer> customer = custRepo.findById(id);
		if(customer.isPresent())
			return customer;
		else {
			return Optional.empty();
		}
	}
	@GetMapping
	public List<Customer> getCustomers(){
		return custRepo.findAll();
	}
	@PostMapping("/{id}")
	public String createCustomer (@RequestBody Customer customer) {
		custRepo.save(customer);
		return "Sign-up completed";
	}
	
	@PutMapping("/{id}")
	
	@DeleteMapping("/{id}")
}
