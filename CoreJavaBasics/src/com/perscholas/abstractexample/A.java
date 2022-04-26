package com.perscholas.abstractexample;

public class A extends Bank{

	public A() {
		// TODO Auto-generated constructor stub
	}
	public A(double deposit) {
		this.deposit = deposit;
	}
	@Override
	public double getBalance() {
		return this.deposit;
	}
}
