package com.perscholas.company;

public class Manager extends Employee{
	private long employeeId;
	private String employeeName;
	private String EmployeeAddress;
	private long phone;
	private double salary;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(long employeeId,String employeeName,String EmployeeAddress,long phone, 
			double salary) {
		super(employeeId,employeeName,EmployeeAddress,phone,salary);
//		this.salary = super.getBasicSalary();
		// TODO Auto-generated constructor stub
		
	}
	//override employee method
	public double calculateTransportAllowance() {
		double allowance = this.getBasicSalary()*15/100;
		if(allowance>= this.getSpecialallowancedefault()) {
		return allowance;}
		else {
			return this.getSpecialallowancedefault();
		}
	}
	
}
