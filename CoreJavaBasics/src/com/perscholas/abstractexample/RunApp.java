package com.perscholas.abstractexample;

import java.util.Iterator;

public class RunApp {

	public RunApp() {
		/*
		 *
1.
Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.



5.
Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
6.
We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
7.
Repeat the above question for 4 rectangles, 4 squares and 5 circles.
Hint- Use array of objects.

		 */
	}

	
	public static void main(String[] args) {
		A a = new A(100.00);
		B b = new B(150.00);
		C c = new C(200.00);
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
		
		StudentA ahmed = new StudentA(20,50,70);
		StudentA yacub = new StudentA(70,30,80);
		System.out.println(Math.round(ahmed.getPercentage()));
		System.out.println(yacub.getPercentage());
		
		SubClass sub = new SubClass();
		sub.a_method();
		sub.normalMethod();
		
		Area areas = new Area();
		System.out.println(areas.CircleArea(5));
		System.out.println(areas.RectangleArea(6, 3));
		System.out.println(areas.SquareArea(5));
		double[][] rectangles = {{8,4},{6,3},{5,3},{7,3}};
		int counter = 0;
		for (double[] t : rectangles) {
			System.out.println("rectangle area is "+ (++counter)+": " + t[0]*t[1]);
		}
	}
}

