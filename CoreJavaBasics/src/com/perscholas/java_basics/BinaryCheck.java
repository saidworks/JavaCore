package com.perscholas.java_basics;

import java.util.Scanner;

public class BinaryCheck {

	public BinaryCheck() {
		// TODO Auto-generated constructor stub

	}
	
	public static void main(String[] args) {
		// create scanner object
		Scanner input= new Scanner(System.in);
	    System.out.print("Enter a binary number: ");
	    // read the value 
	    long binary = input.nextLong();
	    long decimal = convertBinaryToDecimal(binary);
	    System.out.println(decimal);
	    
	}
	
	public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	  }

}
