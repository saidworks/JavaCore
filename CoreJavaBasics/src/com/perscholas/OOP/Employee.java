package com.perscholas.OOP;
import com.perscholas.demo1.Person;
public class Employee extends Person implements Printable {

	  int emp_id;

	  double emp_salary;

	  Address addr;

	 

	  //this constructor is not called

	  Employee()

	  {

		  

	  }
	  

	  //this constructor is called only

	  Employee(int id, String name,int age, char gender,double salary,Address addr)

	  {
		  super(name,age,gender);

		  System.out.println("");

		  

		  this.emp_id=id;

		  this.emp_salary=salary;

		  this.addr= addr; 

	  }

	  

	public void createAddress()

	{
		//take user input for this Employee's address fields

		Address myAddress= new Address("Folks street","NY city","NY",456874);

		myAddress.setStreet("101 South St.");

		myAddress.setCity("Robbinsville");

		myAddress.setState("NJ");

		myAddress.setZipcode(43536);	

		this.addr= myAddress;
	}

	public void display()

	{
		//System.out.println(ORGINIZATION);

		System.out.println("-------------");

		System.out.println("Id : "+this.emp_id);

		super.display();

		System.out.println(this.addr.getStreet());

		System.out.println(this.addr.getCity());

		System.out.println(this.addr.getState());

		System.out.println(this.addr.getZipcode());

		System.out.println("Salary : "+this.emp_salary);

		System.out.println();
	}
	
	public double calculate(int bonus) {

		double  netsalary= bonus+ this.emp_salary;

		return netsalary;

	}

	public int compute(int num1, int num2)

	{

		int time= num2-num1;

		return time;

	}

	void calculate(double n1, double n2)

	{

		System.out.println(n1+n2);

	}

	  public static void main(String[] args) {
		Address addr = new Address("Folks street","NY city","NY",456874);
		Employee manager = new Employee(154857,"Gandolf",26,'M',6500,addr);
		System.out.println(manager.addr.getCity());
		manager.printBlue();
		
	}
	 public void printBlue() {
		 System.out.println("we are print "+ this.getName()+ " using "+ INKCOLOR);
	 }

}
