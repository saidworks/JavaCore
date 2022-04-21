package com.perscholas.demo1;
import java.util.ArrayList;

public class CreateCustomer {

	public static void main(String[] args) {
		
	    
		Customer c1= new Customer();
		
		Customer c2 = new Customer();
		
			
		c1.setName("Bobby");
		c1.setEmail("bobby@gmail.com");
		c1.setAddress("123 street name");
		c1.setPhone(1231231234);
	
	
		System.out.println();
		c2.setName("Lesel-lee-as");
		c2.setEmail("les@gmail.com");
		c2.setAddress("Elm st.");
		c2.setPhone(12345678);
		
		
		System.out.println("details of customer 1");
		System.out.println(c1.getName());
		System.out.println(c1.getEmail());
		
		
		
		System.out.println("details of customer 2");
		System.out.println(c2.getName());
		System.out.println(c2.getEmail());
		
		
		
	
		
		
		
		
		
		
		
		
		
		
//		System.out.println("-------------------------------------------------------");
//		System.out.println("               Printing from the ArrayList");
//		System.out.println("-------------------------------------------------------");
//		System.out.println();
//		
//	    ArrayList <Customer> myCustomers = new ArrayList <Customer> ();
//	    myCustomers.add(c1);
//	    myCustomers.add(c2);
//	    
//	   
//	   for(Customer cust: myCustomers )
//	   {
//		  System.out.println(cust.getName());
//		  System.out.println(cust.getEmail());
//		  System.out.println(cust.getAddress());
//		  System.out.println();
//	   }


	}

}//end of the class




