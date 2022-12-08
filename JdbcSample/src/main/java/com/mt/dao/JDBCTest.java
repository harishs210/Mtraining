package com.mt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","DataGuard432$");
			 System.out.println("Database connection successful!\n");
			 
			// 2. Create a statement
			 statement = connection.createStatement();
				
				// 3. Execute SQL query
			 resultSet = statement.executeQuery("select * from employees");
				
				// 4. Process the result set
				while (resultSet.next()) {
					System.out.println(resultSet.getString("last_name") + ", " + resultSet.getString("first_name"));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
