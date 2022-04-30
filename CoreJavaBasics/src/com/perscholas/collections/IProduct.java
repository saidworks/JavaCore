package com.perscholas.collections;

public interface IProduct {
	String code = "cosmetics";
	String site = "MA";
	public void funMethod();
	default void defaultMethod() {
		System.out.println("I am a default method");
	}
	static void print(IProduct p) {
		System.out.println("I am a static method from IProduct");
	}
}
