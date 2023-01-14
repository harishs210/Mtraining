package com.mycomp.crudapp.service;

import java.util.List;

import com.mycomp.crudapp.dto.EmployeeDto;
import com.mycomp.crudapp.entity.Employee;

public interface EmployeeService {

	Employee insertEmployee(EmployeeDto empDto);

	List<Employee> getAllEmployees();

	Employee getEmployee(int id);

}
