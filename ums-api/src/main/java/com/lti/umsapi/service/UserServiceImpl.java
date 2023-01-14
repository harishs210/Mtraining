package com.lti.umsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.umsapi.dto.UserDto;
import com.lti.umsapi.entity.User;
import com.lti.umsapi.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepo userRepo;
	
	@Override
	public User insertUser(UserDto userDto) {
		User user =  new User(userDto.getName(), userDto.getUsername(), userDto.getEmail(), userDto.getPhone(), userDto.getWebsite());
		
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userRepo.findById(id).get();
	}

	
}
