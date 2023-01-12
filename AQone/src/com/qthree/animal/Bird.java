package com.qthree.animal;

public class Bird extends Animal{

	@Override
	protected void eat() {
		System.out.println("Bird can eat");
	}

	@Override
	protected void sleep() {
		System.out.println("Bird can sleep");
		
	}
	
	protected void fly() {
		System.out.println("Bird can fly");
	}
	
}
