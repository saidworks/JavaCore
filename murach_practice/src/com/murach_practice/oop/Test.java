package com.murach_practice.oop;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("X1257","Great book",12.50,"Dan Brown","2022-03");
		if (book instanceof Product) {
			System.out.println("true");
		}else {System.out.println("false");}
		System.out.println(book.getDisplayText());
		System.out.println(book.getVersion());
		
	}

}
