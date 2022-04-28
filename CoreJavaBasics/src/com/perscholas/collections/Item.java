package com.perscholas.collections;

public class Item implements IProduct{

	public Item() {
		// TODO Auto-generated constructor stub
	}
	public void funMethod() {
		System.out.println("I am fun method from Item");
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
