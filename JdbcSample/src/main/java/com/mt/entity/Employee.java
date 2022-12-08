package com.mt.entity;

public class Employee {
	
	private long id;
	private String fName;
	private String lName;
	private String dept;
	private double sal;
	private String email;
	
	
	
	
	public Employee(long id, String fName, String lName, String dept, double sal, String email) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
		this.sal = sal;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dept=" + dept + ", sal=" + sal
				+ ", email=" + email + "]";
	}
	
	
	
	 
	

}
