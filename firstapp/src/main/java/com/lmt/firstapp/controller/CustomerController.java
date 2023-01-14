package com.lmt.firstapp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmt.firstapp.dto.CustomerDto;
import com.lmt.firstapp.entity.Customer;
import com.lmt.firstapp.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/message")
	public String showMessage() {
		return "Hello, Welcome!!";
	}
	
	@GetMapping("/date")
	public String showDate() {
		return LocalDate.now().toString();
	}
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody CustomerDto customerdto) {
		return customerService.insertCustomer(customerdto);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	

}
