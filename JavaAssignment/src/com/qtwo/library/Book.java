package com.qtwo.library;

public class Book {
	private String name;
	private Author author;
	private int pages;
	private float cost;
	private long booknumber;
	public Book(String name, Author author, int pages, float cost, long booknumber) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.booknumber = booknumber;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", pages=" + pages + ", cost=" + cost + ", booknumber="
				+ booknumber + "]";
	}
	
	
	
	

}
