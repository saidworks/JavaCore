package com.perscholas.abstractexample;

public class Area extends Shape {

	public Area() {
		// TODO Auto-generated constructor stub
	}
	
	double RectangleArea(double length,double width) {
		return length * width;
	}
	double SquareArea(double side) {
		return Math.pow(side, 2);
	}
	double CircleArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
}
