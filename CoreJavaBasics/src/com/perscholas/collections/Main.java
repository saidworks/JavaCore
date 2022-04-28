package com.perscholas.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> regNums = new HashSet();
		//add vehicles registration number
		regNums.add("V53PLS");
		regNums.add("X85ADZ");
		regNums.add("L22SBG");
		regNums.add("W79TRV");
		regNums.add("T11TKZ");
		regNums.add("S58LRE");
		
		Set<String> regNums2 = new TreeSet<>();
		regNums2.add("W79TRV");
		regNums2.add("T11TKZ");
		regNums2.add("S58LRE");
		regNums2.add("R17ATS");
		
		System.out.println(regNums);
		System.out.println("Number of items in set: " + regNums.size());
		// adding duplicate item
		regNums.add("W79TRV");
		System.out.println("after adding duplicate: "+ regNums);
		//check for duplicates using function created below and add if does not exist
		isDuplicate(regNums,"XA12XC");
		System.out.println(regNums);
		isDuplicate(regNums,"XA12XC");
		System.out.println(regNums); 
		regNums.remove("XA12XC");
		System.out.println("after remove : " + regNums);
		isDuplicate(regNums,"XA12XC");
		System.out.println(regNums); 
		
		//iterate through set
		System.out.println("let us iterate through a set");
		System.out.print("Registration done between August and February: ");
		for(String s:regNums) {
			if(s.charAt(0) == 'T') {
				System.out.println(s);
			}
		}
		
		System.out.print("Registration done between March and July: ");
		regNums.forEach(item->{
			if(item.charAt(0) == 'S') {
				System.out.println(item);
			}
		});
		
		System.out.println("Registration done after between August and February: ");
		for(String s:regNums) {
			if(s.charAt(0) < 'T') {
				System.out.println(s);
			}
		}
		
		System.out.println("Registration  done before between March and July: ");
		regNums.forEach(item->{
			if(item.charAt(0) > 'S') {
				System.out.println(item);
			}
		});
		//remove regNum\
		System.out.println("enter the registration number you want to remove");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		System.out.println(userInput);
		String userInput1 = "XA12XC";
	
		if(regNums.contains(userInput)) {
			regNums.remove(userInput);
			System.out.println("it is removed");
		}
		
		
		System.out.println(regNums); 
		// practice intersections and union and difference retainAll addAll removeAll
		
		System.out.println("practice intersections and union and difference retainAll addAll");
		System.out.println(regNums.containsAll(regNums2));
//		System.out.println(regNums.retainAll(regNums2));
		System.out.println(regNums.addAll(regNums2));
		System.out.println(regNums);
		
		// iterators 
		Iterator<String> elements = regNums.iterator();
		Set regWithoutMichigan = new LinkedHashSet(); 
		while(elements.hasNext()) {
			String item = elements.next();
			if(item.charAt(0)=='X') {
				System.out.println(item+" is Michigan state registration");
				elements.remove();
				System.out.println("The "+ item +" Michigan state registration has been removed");
			}
			else {
			regWithoutMichigan.add(item);}
			
		}
		System.out.println(regWithoutMichigan);
	}
	
	public static void isDuplicate(Set regNums,String regNum) {
		boolean isDuplicate = regNums.contains(regNum);
		if(isDuplicate) {
			System.out.println("Item already exists");
		}
		else {
			regNums.add(regNum);
			System.out.println("Item was added");
		}
		
	}

}
