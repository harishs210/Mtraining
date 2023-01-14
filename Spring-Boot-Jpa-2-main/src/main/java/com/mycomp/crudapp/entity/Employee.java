package com.mycomp.crudapp.entity;

import com.mycomp.crudapp.dto.EmployeeDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String firstName;
private String lastName;
private String address;
private String dept;
private double sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
			+ ", dept=" + dept + ", sal=" + sal + "]";
}
public Employee(int id, String firstName, String lastName, String address, String dept, double sal) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.dept = dept;
	this.sal = sal;
}
public Employee() {
	super();
}

public Employee(EmployeeDto emp) {
	this.firstName = emp.getFirstName();
	this.lastName = emp.getLastName();
	this.address = emp.getAddress();
	this.dept = emp.getDept();
	this.sal = emp.getSal();
}

}
