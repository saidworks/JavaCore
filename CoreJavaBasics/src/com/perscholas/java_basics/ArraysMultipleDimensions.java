package com.perscholas.java_basics;
import java.util.InputMismatchException;

import java.util.Scanner;
public class ArraysMultipleDimensions {

	public ArraysMultipleDimensions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][] = new int[5][5]; 
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the number you want to multiply");
		int n1 = scan.nextInt();
		System.out.println("Enter the number of times you want to multiply it");
		int n2 = scan.nextInt();
		int counter = 0;
		int[] sum = new int[5];
		for(int r=0;r<5;r++) {
			for(int c=0; c<5; c++) {
				counter++;
				if(counter<=n2) {
				num[r][c] = n1 * counter;
				System.out.print(num[r][c] + "|");
				sum[r] += num[r][c];
				// add the total of each row
				}
			}
			System.out.println();
			System.out.println(" => SUM of row"+r+":"+sum[r]);
			System.out.println();

		}
		
		for(int r=0;r<5;r++) {
			for(int c=0; c<5; c++) {
				System.out.print(num[r][c]+ " ");
			}
			System.out.println();
		}
	}
	catch(InputMismatchException e) {
		//System.out.println(e.getMessage());
//		throw new InputMismatchException();
		System.out.println("Numbers only please");
		
	}
		
	}

}
