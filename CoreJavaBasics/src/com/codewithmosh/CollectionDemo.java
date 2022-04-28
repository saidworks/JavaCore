package com.codewithmosh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public CollectionDemo() {
		
	}
	
	public static void show() {
		Collection<String> collection = new LinkedList<>();
		collection.add("a");
		collection.add("b");
		collection.add("c");
//		for(var item :collection) {
//			System.out.println(item);
//		}
		Collections.addAll(collection,"Celtics","is","great" );
		System.out.println(collection);
		System.out.println(collection);
		System.out.println(collection.size());
		collection.remove("a");
		collection.remove("b");
		collection.remove("c");
		System.out.println(collection);
		collection.clear();
		System.out.println(collection.isEmpty());
		System.out.println(collection.hashCode());
		System.out.println(collection.spliterator());
		Collections.addAll(collection,"Celtics","is","great" );
		Iterator<String> elements = collection.iterator();
		String celtics = "";
		while(elements.hasNext()) {
			String current = elements.next();
			celtics += current + " ";
		}
		System.out.println(celtics);
		
		
		
	}

}
