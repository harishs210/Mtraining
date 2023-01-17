package com.lti.umsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.umsapi.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
