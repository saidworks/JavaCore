package com.perscholas.cafe;

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
		Product coffee = new Product("coffee", 2.5, "Brazilian Java Coffee");
		Product espresso = new Product("espresso", 3.0, "Espresso coffee small but strong");
		Product capuccino = new Product("capuccino", 3.5, "Italian made Coffee");
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
			System.out.println("Price is "+current.getPrice());
			System.out.println(current.calculateProductTotal());
			taxTotal += current.calculateProductTotal()*TAX;
			salesTotal += current.calculateProductTotal();
		}
		System.out.println("Sales total "+salesTotal);
		System.out.println("Tax total "+taxTotal);

		totalPrice = salesTotal + taxTotal;
		System.out.println("Sales total "+totalPrice);

		
		
	}
}
