package com.mt.employeeapp;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MainApp {
	
	
	static Log logger = LogFactory.getLog(MainApp.class);
	
	public static void main(String[] args) {
		
		logger.info("Using Log");
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Nick", 100000d));
		employees.add(new Employee(100, "Johny", 800000d));
		employees.add(new Employee(105, "Harris", 10000d));
		employees.add(new Employee(104, "Rishi", 500000d));
		employees.add(new Employee(106, "Oman", 750000d));
		
		System.out.println("Using for loop");
		
		for (int i=0; i<employees.size(); i++) {
			logger.info(employees);
		}
		System.out.println("Using for each loop");
		for (Employee employee : employees) {
			logger.info(employee);
		}
		
//		Collections.sort(employees);
//		
//		System.out.println("Fater sorting with id ");
//		employees.stream().forEach(System.out::println);
//		
		logger.info("Iterate Employee using Iterator");
		
		Iterator<Employee> empItr = employees.iterator();
		while(empItr.hasNext()) {
			logger.info(empItr.next());
		}
		
		logger.info("Iterate Employee using backward direction ");
		ListIterator<Employee> lstIterator = employees.listIterator(employees.size());
		
		while(lstIterator.hasPrevious()) {
			logger.info(lstIterator.previous());
		}
		
		employees.stream().map(emp -> emp.getName().toUpperCase()).forEach(System.out::println);
		
		double average =employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
		logger.info(average);
		
		
	}

}
