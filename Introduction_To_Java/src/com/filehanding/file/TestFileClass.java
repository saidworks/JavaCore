package com.filehanding.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestFileClass {

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("writer123.txt");
		System.out.println("Does it exist?" + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read " + file.canRead());
		System.out.println("Can it be written " + file.isDirectory());
		System.out.println("Is it a file " + file.isFile());
		System.out.println("Is it absolute?" + file.isAbsolute());
		System.out.println("Is it hidden?" + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println();
		try {
		FileReader reader = new FileReader(file);
		BufferedReader buffered = new BufferedReader(reader);
		int data ;
		String string;
		while( (string = buffered.readLine()) != null) {
			System.out.println(string);
		}
		  
		FileInputStream inputstream = new FileInputStream(file);
		int i;
		while((i=inputstream.read()) != -1) {
			System.out.print((char)i);
		}
		//write to file https://howtodoinjava.com/java/io/java-append-to-file/
		File a = new File("test.txt");
		FileWriter writer = new FileWriter(a);
		writer.append("It is great being here");
		writer.close();
		byte[] bytes = "Hello World ".getBytes();
		OutputStream output = new FileOutputStream(a,true);
		output.write(bytes);
		
		
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
		
	
	}

}
