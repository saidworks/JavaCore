package com.perscholas.OOP;

public class Car {
	
	public static void main(String[] args) {
		Car mercedes = new Car("C-Class","2022","Mercedes",43550,"Sedan");
		System.out.println("Price of the "+mercedes.brand+" "+mercedes.model+" "+
		                    mercedes.year +" is $"+mercedes.totalPrice());
		System.out.println("The cost calculated using Object : $"+mercedes.costOfMaintenancePerYear(10));
		Car toyota = new Car("RAV 4","2022","Toyota",26525,"SUV");
		System.out.println("Price of the "+toyota.brand+" "+toyota.model+" "+
                toyota.year +" is $"+toyota.totalPrice());
		
		System.out.println("The cost calculated using Object : $"+toyota.costOfMaintenancePerYear(2));
		mercedes.setYear("2021");
		System.out.println(mercedes.getYear());
	}
	
	private String model;
	private String year;
	private String brand;
	private double price;
	// I need to look into the possibility of choosing from array
	private String category;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String model,String year,String brand,double price,String category) {
		this.model = model;
		this.year = year;
		this.brand = brand;
		this.price = price;
		this.category = category;

	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double totalPrice() {
		double markup = 1+(5/100);
		double taxPercentage = 1+(6.25/100);
		double retailPrice = this.price*markup*taxPercentage;
		return retailPrice;
	}
	// visible inside the package and only to subclasses from another package
	protected double costOfMaintenancePerYear(double age) {
		double baseCost = this.price/100;
		return baseCost*(1+(age/100));
	} 

}
