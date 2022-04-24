package com.murach_practice.oop;

public abstract class Product {
	private String code;
	private String description;
	private double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String code,String description,double price) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return description;
	}
	public abstract String getDisplayText();
}
