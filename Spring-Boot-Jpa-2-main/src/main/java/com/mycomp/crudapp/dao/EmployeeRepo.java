package com.mycomp.crudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycomp.crudapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
