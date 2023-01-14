package com.jay.repository;


import org.springframework.data.repository.CrudRepository;

import com.jay.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
