package com.filehanding.file;

import java.io.*;


public class FileHandling1 {
	 public static void main(String args[])
	 {
	     //Writing to a file
	     try {
	    	 FileWriter writer = new FileWriter("writer123.txt");  
	    	 BufferedWriter buffer = new BufferedWriter(writer); 
	    	  
	    	    buffer.write("Introduction to File Handling....More on file handling");  
	    	    buffer.newLine();
	    	    buffer.append(" abc");
	    	    buffer.newLine();
	    	    buffer.append('A');
	    	    buffer.close();  
	    	    
	         System.out.println("Successfully appended!");
	       }
	     catch (Exception e) {
	         System.out.println(e);
	     }
	 }
	

}







