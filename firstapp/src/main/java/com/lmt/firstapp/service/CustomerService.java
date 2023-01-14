package com.lmt.firstapp.service;

import java.util.List;

import com.lmt.firstapp.dto.CustomerDto;
import com.lmt.firstapp.entity.Customer;

public interface CustomerService {
	
	Customer insertCustomer(CustomerDto customerDto);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(int id);
	

}
