package com.perscholas.cafe.asbtraction;

import java.util.HashMap;
import java.util.Scanner;

public class Coffee extends Product {
	boolean sugar,milk;
	HashMap<String, Boolean> options = new HashMap<>();
	public Coffee() {
		// TODO Auto-generated constructor stub
		this.sugar = false;
		this.milk = false;
	}
	public Coffee(String name, double price, String description,boolean sugar,boolean milk) {
		super(name,price,description);
		this.milk = milk;
		this.sugar = sugar;
	}

	@Override
	public double calculateProductSubTotal() {
		// TODO Auto-generated method stub
		return getPrice()*getQuantity();
	}
	public boolean isSugar() {
		return sugar;
	}
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	@Override
	public HashMap<String,Boolean> printOptions() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to add sugar? (type yes or no)");
		String sugar = scan.next();
		if(sugar=="yes") {
		options.put("sugar", true);}
		else {
		options.put("sugar", false);}
		
		System.out.println("Would you like to add milk? (type yes or no)");
		String milk = scan.next();
		if(milk == "yes") {
		options.put("milk", true);}
		else {
		options.put("milk", false);
		}
		
		return options;
	}

	
	@Override
	public void addOptions() {
		this.setSugar(options.get("milk"));
		this.setMilk(options.get("sugar"));
	}
}
