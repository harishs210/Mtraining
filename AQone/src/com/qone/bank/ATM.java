package com.qone.bank;

public class ATM {
	public static void main(String[] args) {
		Account ac1 = new Account(8000528, "Priya Sah", 1000.0d);
		System.out.println("Balance Details...");
		System.out.println("--------------------------");
		ac1.display();
		ac1.deposit(300.0d);
		ac1.display();
		ac1.withdraw(2100.0d);
		ac1.display();
		
	}
}
