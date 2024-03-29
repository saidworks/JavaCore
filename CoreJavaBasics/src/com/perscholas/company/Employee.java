package com.perscholas.company;

public class Employee {
	private static final double SPECIALALLOWANCEDEFAULT = 250.80;
	private static final double HRADEFAULT = 1000.50;
	private long employeeId;
	private String employeeName;
	private String EmployeeAddress;
	private long phone;
	private boolean isManager = false;
	private boolean isEmployee = false;
	private double basicSalary;
	private double specialAllowance = SPECIALALLOWANCEDEFAULT; //has default value 250.80
	private double Hra = HRADEFAULT; //has default value 1000.50
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long employeeId,String employeeName,String EmployeeAddress,long phone, 
			double basicSalary,double specialAllowance, double Hra) {
		// TODO Auto-generated constructor stub
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.EmployeeAddress = EmployeeAddress;
		this.phone = phone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.Hra = Hra;
	}
	Employee(long employeeId,String employeeName,String EmployeeAddress,long phone, 
			double basicSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.EmployeeAddress = EmployeeAddress;
		this.phone = phone;
		this.basicSalary = basicSalary;
	}
	
	Employee(long employeeId,String employeeName,String EmployeeAddress,long phone){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.EmployeeAddress = EmployeeAddress;
		this.phone = phone;
	}
	
	public double calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary*this.specialAllowance/100) + (this.basicSalary*this.Hra/100);
		return salary;
				}
	public double calculateTransportAllowance() {
		double allowanceManager = this.basicSalary*15/100;
		double allowanceEmployee = this.basicSalary*10/100;
		if(this.isManager) {
		return allowanceManager;}
		else if(this.isEmployee) {
			return allowanceEmployee;
		}
		else {
			return this.SPECIALALLOWANCEDEFAULT;
		}
	}
	
	// getters and setters
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	public void setHra(double hra) {
		Hra = hra;
	}

	public static double getSpecialallowancedefault() {
		return SPECIALALLOWANCEDEFAULT;
	}

	public static double getHradefault() {
		return HRADEFAULT;
	}
	
	
	

}
