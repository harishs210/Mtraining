package com.qthree.animal;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
		
		WildAnimal wildAnimal = new WildAnimal();
		wildAnimal.eat();
		wildAnimal.sleep();
		wildAnimal.kill();
		
		Animal animal = new Bird();
		animal.eat();
		animal.sleep();
		
		Animal animal2 = new WildAnimal();
		animal2.eat();
		animal2.sleep();
		

	}

}
