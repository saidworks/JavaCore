package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfStringsPalindrom {

	public ArrayOfStringsPalindrom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of words you want to check for palindrom");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		numberOfWords(n);		
	}
	
	public static void isPalindrom() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a Word");
		String word = userInput.next() ;
		String reversedWord = "";
		for(int i=word.length()-1;i>=0;--i) {
			reversedWord += word.charAt(i);	
		}
		if(word.equals(reversedWord)) {
			System.out.println(word + " is Palindrom");
		}
		else {
			System.out.println("It is not palindrom :(");
		}
	}
	
	public static void numberOfWords(int n) {
		
		for(int i=0;i<n;i++) {
			isPalindrom();
		}
	}

}
