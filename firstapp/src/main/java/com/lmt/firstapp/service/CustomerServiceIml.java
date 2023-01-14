package com.lmt.firstapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmt.firstapp.dao.CustomerRepo;
import com.lmt.firstapp.dto.CustomerDto;
import com.lmt.firstapp.entity.Customer;

@Service
public class CustomerServiceIml implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer insertCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		
		customer.setName(customerDto.getName());
		customer.setType(customerDto.getType());
		customer.setEmail(customerDto.getEmail());
		customer.setPhone(customerDto.getPhone());
		System.out.println("customer service"+customer);
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).get();
	}

}
