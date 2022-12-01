package com.mt.employeeapp;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int compareTo(Employee o) {

		/*
		 * if (this.getId() == o.getId()) return 0; else if (this.getId() > o.getId()) {
		 * return 1; } else { return -1; }
		 */
		
		return this.getName().equals(o.getName())?  1: -1;
	}
	
	
	
	

}
