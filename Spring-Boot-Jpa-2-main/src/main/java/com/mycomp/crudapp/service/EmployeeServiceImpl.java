package com.mycomp.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.crudapp.dao.EmployeeRepo;
import com.mycomp.crudapp.dto.EmployeeDto;
import com.mycomp.crudapp.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	EmployeeRepo employeeRepo;
	@Override
	public Employee insertEmployee(EmployeeDto empDto) {
		Employee employee = new Employee(empDto);
		
		return employeeRepo.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}
	@Override
	public Employee getEmployee(int id) {
		
		return employeeRepo.findById(id).get();
	}

}
