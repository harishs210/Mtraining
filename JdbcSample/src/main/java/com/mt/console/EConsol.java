package com.mt.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.RowSet;

import com.mt.entity.Company;
import com.mt.entity.Employee;

public class EConsol {
	private final Connection conn = this.getConnection();

	public Connection getConnection() {

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "DataGuard432$");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public void startEconsole() {
		System.out.println("Welcom Admin");
		System.out.println("___________________________");
		System.out.println("1. Add a new Employee");
		System.out.println("2. Show all Employee:");
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();

//		1. add a new Employee,
//		2. see all employee,
//		3. search an employee,
//		4. delete an employee,
//		5. update an employee

		int opt = Integer.parseInt(option);

		switch (opt) {
		case 1:
			Employee emp = new Employee(102, "John", "Doe", "IT", 10000.0, "john@mt.com");

			addNewEmploye(emp);
			break;
		case 2:
			System.out.println(viewAllEmployee());
			break;
		default:
			System.out.println("default");
			option = sc.nextLine();
		}
	}

	private int addNewEmploye(Employee emp) {
		System.out.println("Add Employee:");

		String insertSqlQuery = "INSERT INTO EMPLOYEES (ID,LAST_NAME, FIRST_NAME, EMAIL, DEPARTMENT, SALARY) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int rowset = 0;

		try (conn) {
			pstmt = conn.prepareStatement(insertSqlQuery);
			pstmt.setInt(1, (int) emp.getId());
			pstmt.setString(2, emp.getfName());
			pstmt.setString(3, emp.getlName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getDept());
			pstmt.setDouble(6, emp.getSal());

			rowset = pstmt.executeUpdate();

			if (rowset > 0)
				System.out.println("Employee added succesfulyy");

		} catch (SQLException e) {
			System.out.println("Error occured " + e.getMessage());
		}
		return rowset;

	}

	private List<Employee> viewAllEmployee() {
		System.out.println("View All Employee");
		List<Employee> emps = new ArrayList<>();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try (conn) {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(6), rs.getString(5));
				emps.add(emp);

			}

		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		return emps;
	}

	public static void main(String[] args) {

		EConsol cons = new EConsol();
		cons.startEconsole();

	}

}
