package com.perscholas.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class ListB {
	
	public ListB() {
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
			IProduct current =  (IProduct) itr.next();
			current.defaultMethod();
			System.out.println(current);
		}
		try {
		System.out.println(p.equals(i));}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
	
		
		
	}
}
