package com.qfive.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	Connection myConn = null;
	
	public Connection getConnection() throws SQLException {
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db", "root", "DataGuard432$");

			System.out.println("Mysql db  connected...");

		} catch (SQLException e) {
			throw new SQLException(e.getMessage());
		}
		return myConn;
	}


}
