package com.perscholas.company;

public class InheritenceActivity {
	boolean isManager = true;
	public InheritenceActivity() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Manager manager = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Salary of the Manager is: "+ manager.calculateSalary());
		System.out.println("Allowance for the Manager is: "+ manager.calculateTransportAllowance());
		Trainee trainee = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Salary of the Employee is: "+trainee.calculateSalary());
		System.out.println("Allowance for the Employee is: "+ trainee.calculateTransportAllowance());

	}

}
