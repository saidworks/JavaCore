package com.perscholas.cafe.asbtraction;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CafeApp {
	static final double TAX = 0.03; 
	public CafeApp() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		boolean sugar=false,milk=false,peppermint=false,whippedCream=false,extraShot=false,macchiato=false;
		Product coffee = new Coffee("coffee", 2.5, "Brazilian Java Coffee",sugar,milk);
		Product espresso = new Espresso("espresso", 3.0, "Espresso coffee small but strong",extraShot,macchiato);
		Product capuccino = new Capuccino("capuccino", 3.5, "Italian made Coffee",peppermint,whippedCream);
		List<Product> products = new ArrayList<Product>();
	
		products.add(espresso);
		products.add(coffee);
		products.add(capuccino);
		
		Scanner scan = new Scanner(System.in);
		Iterator elements = products.iterator();
		double totalPrice = 0;
		double salesTotal = 0;
		double taxTotal = 0;
		
		while(elements.hasNext()) {
			Product current = (Product) elements.next(); 
			System.out.println("Please enter the quantity of "+ current.getName());
			current.setQuantity(scan.nextInt()) ;
			System.out.println(current.getName());
			System.out.println(current.getDescription());
			current.printOptions();
			current.addOptions();
			System.out.println("Price is "+current.getPrice());
			System.out.println(current.calculateProductSubTotal());
			taxTotal += current.calculateProductSubTotal()*TAX;
			salesTotal += current.calculateProductSubTotal();
		
		}
		System.out.println("Sales total "+salesTotal);
		System.out.println("Tax total "+taxTotal);

		totalPrice = salesTotal + taxTotal;
		System.out.println("total price is "+totalPrice);

		
		scan.close();
	}
}

