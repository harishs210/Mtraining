package com.qfive.hotel;

import java.util.List;

import com.qfive.hotel.model.Guest;

public interface IGuestDao {
	List<Guest> getAllGuest();
	Guest getGuestByName();

}
