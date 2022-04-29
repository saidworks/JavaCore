package com.perscholas.cafe.asbtraction;

import java.util.HashMap;
import java.util.Scanner;

public class Capuccino extends Product{
	boolean peppermint,whippedCream;
	HashMap<String, Boolean> options = new HashMap<>();
	
	public Capuccino() {
		// TODO Auto-generated constructor stub
		this.peppermint = false;
		this.whippedCream = false;
	}
	public Capuccino(String name, double price, String description,boolean pepperMint,boolean whippedCream) {
		super(name,price,description);
		this.peppermint = pepperMint;
		this.whippedCream = whippedCream;
	}

	@Override
	public double calculateProductSubTotal() {
		double subtotal = getPrice()*getQuantity();
		if(peppermint) {
			subtotal +=2;
		}
		if(whippedCream) {
			subtotal +=1;
		}
		return subtotal;
	}
	
	public boolean isPeppermint() {
		return peppermint;
	}
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	public boolean isWhippedCream() {
		return whippedCream;
	}
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	@Override
	public HashMap<String,Boolean> printOptions() {
		//peppermint,whippedCream
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to add peppermint? (type yes or no)");
		String peppermint = scan.next();
		if(peppermint=="yes") {
		options.put("peppermint", true);}
		else {
		options.put("peppermint", false);}
		
		System.out.println("Would you like to add whipped cream? (type yes or no)");
		String whippedCream = scan.next();
		
		if(whippedCream == "yes") {
		options.put("whippedCream", true);}
		else {
		options.put("whippedCream", false);
		}
		
		return options;
	}

	
	@Override
	public void addOptions() {
		this.setWhippedCream(options.get("whippedCream"));
		this.setPeppermint(options.get("peppermint"));
	}
}
