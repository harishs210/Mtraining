package com.qfive.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.qfive.hotel.model.Guest;
import com.qfive.hotel.util.DBConnection;

public class GuestDao implements IGuestDao {
	private Connection con;
	private Statement stmt;

	@Override
	public List<Guest> getAllGuest() {
		String sqlQuery = "SELECT * FROM GUEST";
		List<Guest> guests = new ArrayList<>();
		Guest guest = null;
		ResultSet rs = null;

		try {
			con = new DBConnection().getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				guest = new Guest(rs.getInt("guest_id"), rs.getString("name"), rs.getString("city"));
				guests.add(guest);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return guests;
	}

	@Override
	public Guest getGuestByName() {
		 getAllGuest().stream().map(guest -> guest.getName()).forEach(System.out::print);
		 //todo
		 return null;
	}

}
