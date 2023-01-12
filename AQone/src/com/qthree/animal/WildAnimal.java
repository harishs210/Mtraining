package com.qthree.animal;

public class WildAnimal extends Animal {

	@Override
	protected void eat() {
		System.out.println("WildAnimal can eat");
	}

	@Override
	protected void sleep() {
		System.out.println("WildAnimal can sleep");
		
	}
	
	public void kill() {
		System.out.println("WildAnimal can kill");
	}

}
