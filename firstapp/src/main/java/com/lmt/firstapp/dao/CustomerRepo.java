package com.lmt.firstapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmt.firstapp.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
