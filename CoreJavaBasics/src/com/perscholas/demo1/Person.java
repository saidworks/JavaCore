package com.perscholas.demo1;

public class  Person{

	static final String COURSE="TEK RD JAVA EAST";

	static double raise=5;

	

	// instance variables, properties or property variables, state variables
	String name;
	String fname;

	String lname;

	String address;

	int age;

	String phone;

	char gender;

	double salary;

	double netincome;

	boolean active;

	

	public Person(){}

	

	

	

	//constructor overloading 

	public Person(boolean act)

	{

		active = act;

	}

	public Person ( String name, int age, char gender)

	{

	    this.name = name;
		
		this.age=age;

		this.gender=gender;

		

		

	}

	public Person (String fname, String lname, String address, int age, String phone, double salary, char gender,boolean active)

	{

	    this.fname=fname;

		this.lname=lname;

		this.address=address;

		this.age=age;

		this.phone=phone;

		this.salary=salary;

		this.gender=gender;

		

		this.active= active;

		

	}
	public void display() {
		System.out.println("The course :"+Person.COURSE);
	}
	

	// non static or object methods

	 

	 void calculateNetIncome()

	  {

		  double bonus;

		  bonus = (this.salary * .05);

		  this.netincome= this.salary+bonus;

		  

	  }

	

	

	

 public static void main(String[] args) {

	

	 // creating or instantiating  an object from Person class 

     Person p1 = new Person();

     

	 p1.fname= "Peter";

	 p1.lname= "Jones";

	 p1.address= "123 some street, NY";

	 p1.phone="609-123-1234";

	 p1.gender='M';

	 p1.age=36;

	 p1.salary=2000.0;

	 p1.active=true;

	 

	//invoking object method

	 

	 p1.calculateNetIncome();

	 

	  

	 

		 

	 Person p3 = new Person(false);

	 p3.fname="Shalu";

	 p3.lname="Shah";

	 p3.salary=1234.02;

	 

	 p3.calculateNetIncome();

	 

	 

	 

	 Person p4 = new Person("Tom", "jhonson","1234 sme street", 33, "223-333-4444",1189.25,'M',false);

	 p4.calculateNetIncome();

	 

	 System.out.println(COURSE);

	 System.out.println();

	 System.out.println("All about person1");

	

	 System.out.println(p1.fname);

	 System.out.println(p1.address);

	 System.out.println(p1.phone);

	 System.out.println(p1.salary);

	 System.out.println(p1.netincome);

	 

	 System.out.println();

	 

 

     System.out.println();

	 

	 System.out.println("All about person3");

	 System.out.println(p3.fname);

	 System.out.println(p3.lname);

	 System.out.println(p3.active);

	 System.out.println(p3.salary);

	 System.out.println(p3.netincome);

	 

	 

      System.out.println();

	 

	 System.out.println("All about person4");

	 System.out.println(p4.fname);

	 System.out.println(p4.address);

	 System.out.println(p4.phone);

	 System.out.println(p4.salary);

	 System.out.println(p4.netincome);

	  

	 

	}







public static double getRaise() {
	return raise;
}







public static void setRaise(double raise) {
	Person.raise = raise;
}







public String getName() {
	return name;
}







public void setName(String name) {
	this.name = name;
}







public String getFname() {
	return fname;
}







public void setFname(String fname) {
	this.fname = fname;
}







public String getLname() {
	return lname;
}







public void setLname(String lname) {
	this.lname = lname;
}







public String getAddress() {
	return address;
}







public void setAddress(String address) {
	this.address = address;
}







public int getAge() {
	return age;
}







public void setAge(int age) {
	this.age = age;
}







public String getPhone() {
	return phone;
}







public void setPhone(String phone) {
	this.phone = phone;
}







public char getGender() {
	return gender;
}







public void setGender(char gender) {
	this.gender = gender;
}







public double getSalary() {
	return salary;
}







public void setSalary(double salary) {
	this.salary = salary;
}







public double getNetincome() {
	return netincome;
}







public void setNetincome(double netincome) {
	this.netincome = netincome;
}







public boolean isActive() {
	return active;
}







public void setActive(boolean active) {
	this.active = active;
}







public static String getCourse() {
	return COURSE;
}


}