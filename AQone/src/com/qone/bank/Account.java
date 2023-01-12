package com.qone.bank;

public class Account {
	private long acNum;
	private String name;
	private double balance;
	
	
	
	public Account(long acNum, String name, double balance) {
		super();
		this.acNum = acNum;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount) {
		System.out.println("Deposit Amount  : "+amount);
		this.balance += amount;
	}
	public double withdraw(double amount) {
		System.out.println("Withdraw Amount : "+amount);
		if(amount>this.balance) {
			System.out.println("Insufficient Balance.");
			return 0;
		}
		this.balance -= amount;
		return amount;
		
	}
	
	public void display() {
		
		System.out.println("Account Balance : "+this.balance);
		
	}
	
	

}
