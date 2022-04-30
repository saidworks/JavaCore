package com.collections.maps;

import java.util.*;

public class CountOccurrenceOfWords{
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a text");
//		String sentence = scan.next();
		String sentence = "Great great";
		Map<String, Integer> map = new TreeMap<>();
		String[] words = sentence.split(" ");
		for(int i=0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if(key.length()>0) {
				if(!map.containsKey(key)) {
					map.put(key,1);
				}
				else {
					int value = map.get(key);
					value++;
					System.out.println(value);
					map.put(key,value);
				}
			}
		}
		map.forEach((k,v)->{
			System.out.println(k+" was repeated :" + v);
		});
		
	}
}