package com.perscholas.java_basics;

import java.util.Scanner;

public class Calculator {
	static int thisIsAStaticVar;
	public Calculator(int thisIsAStaticVar) {
		// TODO Auto-generated constructor stub
		this.thisIsAStaticVar = thisIsAStaticVar;
	}

	public static void main(String[] args) {
		Calculator test = new Calculator(2);
		System.out.println(Calculator.thisIsAStaticVar);
		Calculator test1 = new Calculator(4);
		System.out.println(Calculator.thisIsAStaticVar);

		System.out.println("Menu"+System.lineSeparator());
		System.out.println("1.Add");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.AVG");
		System.out.println("6.Exponent");
		System.out.println("7.Square root");
		System.out.println("8.Close");
		System.out.println("Please choose from the above operations by entering its respective number"+System.lineSeparator());		
		Scanner userChoice = new Scanner(System.in); 
		int operation = userChoice.nextInt();
		switch(operation){
			case 1: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println("enter the second number");
				int b = userChoice.nextInt();
				System.out.println(add(a,b));
				break;
			}
			case 2: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println("enter the second number");
				int b = userChoice.nextInt();
				System.out.println(substract(a,b));
				break;
			}
			case 3: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println("enter the second number");
				int b = userChoice.nextInt();
				System.out.println(multiply(a,b));
				break;
			}
			case 4: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println("enter the second number");
				int b = userChoice.nextInt();
				System.out.println(divide(a,b));
				break;
			}
			case 5: {
				System.out.println("How many numbers you want to calculate average for? ");
				int length = userChoice.nextInt();
				System.out.println(average(length));
				break;
			}
			case 6: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println("enter the second number");
				int b = userChoice.nextInt();
				System.out.println(exponent(a,b));
				break;
			}
			case 7: {
				System.out.println("enter the first number");
				int a = userChoice.nextInt();
				System.out.println(squareRoot(a));
				break;
			}
			case 8: exit();
					break;
			default: System.out.println("please enter a valid choice");
					break;
			
		}
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	public static double divide(int a, int b) {
		double result = a / b;
		return result;
	}
	public static double average(int length) {
		//I need to look at System.in and inputstream for more understanding
		Scanner userInput = new Scanner(System.in);
		int sum = 0;
		for(int i = 0;i<length;i++) {
			System.out.println("Please enter the number "+i );
			sum += userInput.nextInt();
		}
		userInput.close();
		double AVG = sum/length; 
		return AVG;
	}
	public static long exponent(int a, int b) {
		long result = (long)Math.pow(a, b);
		return result;
	}
	public static long squareRoot(int a) {
		long result = (long)Math.sqrt(a);
		return result;
	}
	public static void exit() {
		System.exit(0);
	}
}
