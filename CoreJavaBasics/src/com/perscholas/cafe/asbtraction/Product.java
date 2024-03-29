package com.perscholas.cafe.asbtraction;

import java.util.HashMap;

public abstract class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public abstract double calculateProductSubTotal();
	public abstract void addOptions();
	public abstract HashMap<String, Boolean> printOptions();

	
}

