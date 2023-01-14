package com.lti.umsapi.service;

import java.util.List;

import com.lti.umsapi.dto.UserDto;
import com.lti.umsapi.entity.User;

public interface UserService {
	User insertUser(UserDto userDto);

	List<User> getAllUsers();

	User getUserById(int id);

}
