package com.murach_practice.oop;

public final class Book extends Product {
	private String author;
	private String version;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String code,String description,double price,String author,String version) {
		super(code,description, price);
		this.author = author;
		this.version = version;
	}
	@Override
	public String getDisplayText() {
		return super.toString() + " by " + author;
	}
	
	public final String getVersion() {
		return version;
	}

}
