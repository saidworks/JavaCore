package murach.exceptiontester;

import java.io.*;
import java.util.Scanner;

public class ExceptionTesterApp {

    public static void main(String[] args) {
        System.err.println("In main: calling Method1.");
        Method1();
        System.err.println("In main: returned from Method1.");
    }

    public static void Method1() {
        System.err.println("\tIn Method1: calling Method2.");
        Method2();
        System.err.println("\tIn Method1: returned from Method2.");
    }

    public static void Method2() {
        System.err.println("\t\tIn Method2: calling Method3.");
        Method3();
        System.err.println("\t\tIn Method2: returned from Method3.");
    }

    public static void Method3() {
        System.err.println("\t\t\tIn Method3: Entering.");

        //Add code to throw an exception here.
       // ArithmeticException
        try {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to divide by");
        int b = input.nextInt();
        System.out.println(a/b);}
       	catch(ArithmeticException e) {
       		System.err.println(e.getMessage() + " is not allowed"); 
       	}
       
        //IndexOutOfBound
        int[] arr = {1,2,3,4,5};
        try {
        for(int i=0;i<=arr.length;i++) {
        	System.out.println("number is : "+ arr[i]);
        }}
        catch(IndexOutOfBoundsException e) {
        	System.err.println(e.getMessage());
        }
       
        System.err.println("\t\t\tIn Method3: Exiting.");
    }
}
