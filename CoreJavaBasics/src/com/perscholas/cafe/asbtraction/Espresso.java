package com.perscholas.cafe.asbtraction;

import java.util.HashMap;
import java.util.Scanner;

public class Espresso extends Product {
	boolean extraShot,macchiato;
	HashMap<String, Boolean> options = new HashMap<>();
	public Espresso() {
		// TODO Auto-generated constructor stub
		this.extraShot = false;
		this.macchiato = false;
	}
	public Espresso(String name, double price, String description,boolean extraShot,boolean macchiato) {
		super(name,price,description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	@Override
	public double calculateProductSubTotal() {
		// TODO Auto-generated method stub
		double subtotal = getPrice()*getQuantity();
		if(extraShot) {
			subtotal +=2;
		}
		if(macchiato) {
			subtotal +=1;
		}
		return subtotal;
	}
	public boolean isExtraShot() {
		return extraShot;
	}
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public boolean isMacchiato() {
		return macchiato;
	}
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	@Override
	public HashMap<String,Boolean> printOptions() {
		//extraShot,macchiato;
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to add an extra shot? (type yes or no)");
		String extraShot = scan.next();
		if(extraShot == "yes") {
		options.put("extraShot", true);}
		else {
		options.put("extraShot", false);}
		System.out.println("Would you like to add macchiato? (type yes or no)");
		String macchiato = scan.next();
		
		if(macchiato == "yes") {
		options.put("macchiato", true);}
		else {
		options.put("macchiato", false);
		}
		return options;
	}

	
	@Override
	public void addOptions() {
		this.setMacchiato(options.get("macchiato"));
		this.setExtraShot(options.get("extraShot"));
	}

}
