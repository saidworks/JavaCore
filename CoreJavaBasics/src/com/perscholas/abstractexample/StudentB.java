package com.perscholas.abstractexample;

public class StudentB extends Marks {

	public StudentB() {
		// TODO Auto-generated constructor stub
	}
	public StudentB(double a,double b,double c) {
		super(a,b,c);
	}
	@Override
	public double getPercentage() {
		double sum = getA() + getB() + getC();
		return sum/3;
	}
}
