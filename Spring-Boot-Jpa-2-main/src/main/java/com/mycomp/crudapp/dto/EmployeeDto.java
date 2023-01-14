package com.mycomp.crudapp.dto;

public class EmployeeDto {
	private String firstName;
	private String lastName;
	private String address;
	private String dept;
	private double sal;
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
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(String firstName, String lastName, String address, String dept, double sal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dept = dept;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDto [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", dept="
				+ dept + ", sal=" + sal + "]";
	}
	
}
