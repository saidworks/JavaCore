package com.filehanding.file;
import java.io.*;
//import java.io.FileInputStream;
//
//
//import java.io.BufferedReader;
//
//import java.io.InputStreamReader;

public class FileHandling {
	 public static void main(String args[])
	 {
	     
		//********************************
		// Reading from a byte stream
		//********************************
		 
	     try {
	         FileInputStream fileIn
	             = new FileInputStream("file.txt");
	         BufferedReader br = new BufferedReader(new InputStreamReader(fileIn));
	         int i = 0;
	         
	         
	        //System.out.println((char)fileIn.read());
	         
//	         while ((i = fileIn.read()) != -1) {
//	             System.out.print((char)i);
//	         }
	         
	        
	         
	         String line;
	         while ((line = br.readLine()) != null) {
	             System.out.println(line);
	         }
	         
	         fileIn.close();
	         
	     }//end of try block 
	     
	     catch (Exception e) {
	         System.out.println(e);
	     }
	     
		 
		 //********************************
		 //Reading from a character stream
		 //********************************
	     
	     System.out.println();
	     try {
	       FileReader fr=new FileReader("file.txt");    
           BufferedReader br=new BufferedReader(fr);    
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
           br.close();    
           fr.close();   
	     } //end of try block
	     
	     catch (Exception e) {
	         System.out.println(e);
	     }
	     
	 }// end of main()
	

}







