package com.perscholas.company;

public class Trainee extends Employee {
	private long employeeId;
	private String employeeName;
	private String EmployeeAddress;
	private long phone;
	private double salary;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(long employeeId,String employeeName,String EmployeeAddress,long phone, 
			double salary) {
		super(employeeId,employeeName,EmployeeAddress,phone,salary);
		// TODO Auto-generated constructor stub
		
	}
	
}
