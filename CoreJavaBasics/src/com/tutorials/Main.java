package com.tutorials;

import java.util.Iterator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		GenericList list = new GenericList<String>();
		list.add("Game");
		list.add("Boston");
		Iterator iterator = list.iterator();		
		while(iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}
		
		//collections
		CollectionDemo learn = new CollectionDemo();
		learn.show();
	}
}
