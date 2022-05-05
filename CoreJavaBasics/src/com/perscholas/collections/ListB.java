package com.perscholas.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class ListB {
	
	public ListB() {
		// TODO Auto-generated constructor stub
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		ArrayList<IProduct> exampleList = new ArrayList<IProduct>();
		Product p = new Product();
		IProduct.print(p);
		
		Item i = new Item();
		exampleList.add(p);
		exampleList.add(p);
		exampleList.add(p);
		exampleList.add(p);
		exampleList.set(1,i);
		ArrayList<IProduct> clonedList = (ArrayList<IProduct>)(exampleList.clone());
		exampleList.add(p);
		System.out.println("Cloned"+clonedList);
		
		
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
		
		
		//Queue Dequeue, Priority Queue
		Queue<String> queue = new LinkedList<>();
		queue.offer("oklahama");
		queue.offer("Indiana");
		queue.offer("Texas");
		queue.offer("Virginia");
		Iterator elements = queue.iterator();
		while(elements.hasNext()) {
			String current = (String) elements.next();
			System.out.println("element "+current);
		}
		while(queue.size()>0) {
			System.out.println(queue.remove() + " ");
		}
		
		
	}
}
