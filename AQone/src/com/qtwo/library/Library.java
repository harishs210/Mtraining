package com.qtwo.library;

public class Library {
	public static void main(String[] args) {
		Author mark = new Author("Mark", 36, "male");
		Author mona = new Author("Mona", 32, "female");
		Author james = new Author("James", 38, "female");
		Book [] book = new Book[5];
		book[0] = new Book("Harry Poter", mona, 1008, 32000.0f, 123231);
		book[1] = new Book("Java Headfirst", james, 2308, 32000.0f, 32343);
		book[2] = new Book("Spring ", mark, 1008, 32000.0f, 123231);
		book[3] = new Book("React Poter", mona, 1008, 32000.0f, 123231);
		book[4] = new Book("Jenkin", mona, 1008, 32000.0f, 123231);
		
		int index = 4;
		
		System.out.println(book[index]);
		System.out.println("--------------------------");
		
		for (Book bk : book) {
			System.out.println(bk);
			
		}
		
	}
}
