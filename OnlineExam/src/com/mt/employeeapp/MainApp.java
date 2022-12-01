package com.mt.employeeapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Nick", 100000d));
		employees.add(new Employee(100, "Johny", 800000d));
		employees.add(new Employee(105, "Harris", 10000d));
		employees.add(new Employee(104, "Rishi", 500000d));
		employees.add(new Employee(106, "Oman", 750000d));
		System.out.println("Using for loop");
		for (int i=0; i<employees.size(); i++) {
			System.out.println(employees);
		}
		System.out.println("Using for each loop");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("Using stream ");
		employees.stream().forEach(System.out::println);
		
		
//		Collections.sort(employees);
//		
//		System.out.println("Fater sorting with id ");
//		employees.stream().forEach(System.out::println);
//		
		System.out.println("Iterate Employee using Iterator");
		
		Iterator<Employee> empItr = employees.iterator();
		while(empItr.hasNext()) {
			System.out.println(empItr.next());
		}
		
		System.out.println("Iterate Employee using backward direction ");
		ListIterator<Employee> lstIterator = employees.listIterator(employees.size());
		
		while(lstIterator.hasPrevious()) {
			System.out.println(lstIterator.previous());
		}
		
		employees.stream().map(emp -> emp.getName().toUpperCase()).forEach(System.out::println);
		
		double average =employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
		System.out.println(average);
		
		System.out.println("Sorted using stream");
		employees.stream().sorted().forEach(System.out::print);
		
	}

}
