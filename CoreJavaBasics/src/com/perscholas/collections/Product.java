package com.perscholas.collections;

public class Product implements IProduct {
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public void funMethod() {
		System.out.println("I am a fun method");
	};
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product t = (Product) obj;
			if(code.equals(t.code)) {
				return true;
			}	
		}
		return false;
	}
}
