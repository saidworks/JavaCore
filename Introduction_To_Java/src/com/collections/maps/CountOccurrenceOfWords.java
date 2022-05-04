package com.collections.maps;

import java.util.*;

public class CountOccurrenceOfWords{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a text");
		String sentence = scan.nextLine();
		System.out.println(sentence);

		Map<String, Integer> map = new TreeMap<>();
		String[] words = sentence.split(" ");
		for(String word : words) {
			String key = word;
			if(key.length()>0) {
				if(!map.containsKey(key)) {
					map.put(key,1);
				}
				else {
					int value = map.get(key);
					value++;
					System.out.println(key+value);
					map.put(key,value);
				}
			}
		}
		map.forEach((k,v)->{
			System.out.println(k+" was repeated :" + v);
		});
		scan.close();
	}
}