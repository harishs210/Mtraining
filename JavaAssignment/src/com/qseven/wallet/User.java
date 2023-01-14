package com.qseven.wallet;

public class User {
	private int id;
	private String username;
	private String email;
	private double walletBaance;
	public User(int id, String username, String email, double walletBaance) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletBaance = walletBaance;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the walletBaance
	 */
	public double getWalletBaance() {
		return walletBaance;
	}
	/**
	 * @param walletBaance the walletBaance to set
	 */
	public void setWalletBaance(double walletBaance) {
		this.walletBaance = walletBaance;
	}
	
	public boolean makePayment(double billAmount) {
		return false;
	}
	

}
