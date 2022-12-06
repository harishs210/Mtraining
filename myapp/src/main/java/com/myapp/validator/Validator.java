package com.myapp.validator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.LogFactory;

import com.myapp.dto.Employee;

public class Validator {
	
	
	public void validate(Employee employee) throws Exception {
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");
		try {
			if(employee.getName()==null || employee.getName().isBlank())
				throw new Exception("Validator.INVALID_EMPLOYEE_NAME");
			if( employee.getId()<1000)
				throw new Exception("Validator.INVALID_EMPLOYEE_ID");
		}
		catch(Exception exception) {
			LogFactory.getLog(this.getClass()).error(config.getProperty(exception.getMessage()));
			throw exception;
		}
	}
	
}