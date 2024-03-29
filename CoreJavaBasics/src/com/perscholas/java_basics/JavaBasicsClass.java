package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class JavaBasicsClass {

	public JavaBasicsClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//one
		int  a = 1;
		int b = 2;
		int sum = a + b ;
		System.out.println("Sum of integers a and b is : "+sum);
		//two
		double  c = 123412.4;
		double d = 254855.5;
		double sum_double = c + d ;
		System.out.println("Sum of double c and d is : "+sum_double);
		//third
		int  e = 1234;
		double f = 254855.5;
		double sum_int_double = e + f ; // sum should be double
		System.out.println("Sum of an integer and a double e and f is : "+sum_int_double);
		
		//four 
		int  small = 1;
		int large = 2;
		int divid_by_small =  large/small ;
		System.out.println("division of integers large by small is : "+divid_by_small);
		float divid_by_small_float =  (float) large / small ; // after casting large to float we need to change the datatype of the result to float or we will get a type mismatch error
		System.out.println("division of a float large by small integer is : "+divid_by_small_float);
		
		//fifth
		double  g = 123412.4;
		double h = 254855.5;
		double division_double = h / g ;
		System.out.println("division of double h by g is : "+division_double);
		double division_double_int = (int) (h / g) ;
		System.out.println("division of double h by g casted to integer is : "+division_double_int);
		
		//sixth
		int x  = 5;
		int y = 6;
		double q = y/x;
		System.out.println("division of integer y by x is q : "+q);
		q = (double)(y)/x;
		System.out.println("division of double y by integer x is q : "+q);
		
		//seventh
		final int iAmConstant = 2;
		double sum_with_constant = q + iAmConstant;
		System.out.println("Sum of constant iAmConstant and double q is : "+sum_with_constant);
		
		// Eighth Products coffee, cappuccino, espresso, green tea..etc
		double coffee = 2.5;
		double espresso = 2;
		double greenTea = 3.5;
		double subTotal;
		double Total;
		subTotal = 2.5*3 + 2*4 + 3.5*2;
		final double SALES_TAX = 6.25/100;
		Total = (1+SALES_TAX)*subTotal;
		//Method one
		DecimalFormat formatDecimal = new DecimalFormat("##.00");
		System.out.println("The total to be paid (calculated using DecimalFormat.format()): "+formatDecimal.format(Total));
		//method two 
		Total = Math.round(Total*100.0)/100.0;
		System.out.println("The total to be paid (Math.round()): "+Total);
	 
	}

}
