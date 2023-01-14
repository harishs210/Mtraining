package com.mycomp.crudapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.crudapp.dto.EmployeeDto;
import com.mycomp.crudapp.entity.Employee;
import com.mycomp.crudapp.service.EmployeeService;



@RestController
@RequestMapping("/api")
public class EmployeesAPI {
	@Autowired
	EmployeeService employeeService;
    @PostMapping("/employees")
	public Employee addEmployee(@RequestBody EmployeeDto empDto) {
		return employeeService.insertEmployee(empDto);
	}
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
    	return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
    	return employeeService.getEmployee(id);
    }
    

	
}
