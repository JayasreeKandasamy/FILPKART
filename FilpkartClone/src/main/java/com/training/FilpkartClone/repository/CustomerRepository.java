package com.training.FilpkartClone.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository {
      extends JpaRepository<Customer,Integer> {
}
