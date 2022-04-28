package com.perscholas.collections;

import java.util.*;


public class List {
	
	public List() {
		// TODO Auto-generated constructor stub
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		List<IProduct> exampleList = new ArrayList<IProduct>();
		Product p = new Product();
		Item i = new Item();
		exampleList.add(p);
		exampleList.add(p);
		exampleList.add(p);
		exampleList.add(p);
		exampleList.set(1,i);
		Iterator itr = exampleList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		try {
		System.out.println(p.equals(i));}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
	
		
		
	}
}
