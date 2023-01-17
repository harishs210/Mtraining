package com.lti.umsapi.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.umsapi.dto.UserDto;
import com.lti.umsapi.entity.User;
import com.lti.umsapi.service.UserService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		return userService.getAllUsers();
		
	}
	
	@PostMapping("/users")
	public User saveCustomer(@RequestBody UserDto userdto) {
		return userService.insertUser(userdto);
	}
	
	
	
	@GetMapping("user/{userId}")
	public User getUserById(@PathVariable  Integer userId) {
		return userService.getUserById(userId);
	}
	
	

}
