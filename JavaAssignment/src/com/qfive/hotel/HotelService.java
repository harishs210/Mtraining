package com.qfive.hotel;

class HotelService{
	public static void main(String[] args) {
		IGuestDao dao = new GuestDao();
		System.out.println(dao.getAllGuest());
		dao.getGuestByName();
	}
}