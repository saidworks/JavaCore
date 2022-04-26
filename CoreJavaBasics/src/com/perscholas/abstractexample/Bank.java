package com.perscholas.abstractexample;

public abstract class Bank {
	public double deposit;
	public Bank(){
		
	}
	public Bank(double deposit) {
		this.deposit = deposit;
	}
		// TODO Auto-generated constructor stub
		/*
		 * 2.
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.*/
		public abstract double getBalance();
		
	}


