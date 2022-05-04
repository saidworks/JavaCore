package com.perscholas.lambdas;

import java.util.Scanner;

public class MyCalcMain {
	@FunctionalInterface
	interface IFirst<T>{
		T compute(T num1,T num2);
	}
	static IFirst<Double> addition = (n,m) -> {
		return n+m;
	};
	static IFirst<Double> substraction = (n,m) -> {
		return n-m;
	};
	static IFirst<Double> multiplication = (n,m) -> {
		return n+m;
	};
	static IFirst<Double> division = (n,m) -> {
		try {
		return	n/m;}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			return m;
		}
	
	};
	static Scanner sc = new Scanner(System.in);
	MyCalcMain(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("choose an operation \n + Addition  \n - Substraction  \n * Multiplication  \n / Division");
		String choice = sc.next();
		System.out.println("enter the first number");
		double num1 = sc.nextDouble();
		System.out.println("enter the second number");
		double num2 = sc.nextDouble();

		
		
		
		switch(choice) {
		case "+" : System.out.println(addition.compute(num1, num2));
					break;
		case "*" :  System.out.println(multiplication.compute(num1, num2));
					break;
		case "/" :  System.out.println(division.compute(num1, num2));
					break;
		case "-" :  System.out.println(substraction.compute(num1, num2));
					break;
		}
		
		
	}

}
