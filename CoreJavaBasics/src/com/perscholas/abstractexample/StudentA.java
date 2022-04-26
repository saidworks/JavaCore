package com.perscholas.abstractexample;

public class StudentA extends Marks {

	public StudentA() {
		// TODO Auto-generated constructor stub
	}
	public StudentA(double a,double b,double c) {
		super(a,b,c);
	}
	@Override
	public double getPercentage() {
		double sum = getA() + getB() + getC();
		return sum/3;
	}
}
