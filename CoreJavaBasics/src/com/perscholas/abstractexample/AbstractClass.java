package com.perscholas.abstractexample;

public abstract class AbstractClass {

	public AbstractClass() {
		// TODO Auto-generated constructor stub
		/*4.
An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
		 * */
		System.out.println("This is constract of abstract class");
	}
	
	
		
	abstract void a_method();
	public void normalMethod() {
		System.out.println("This is a normal method");
	}

}
