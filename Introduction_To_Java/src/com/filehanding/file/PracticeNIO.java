package com.filehanding.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PracticeNIO {
	public static void main(String[] args) throws IOException {
		//IO
		String fname = "C:/Users/saidworks/Downloads/nio.txt";
		try {
		File f = new File(fname);
		FileReader reader = new FileReader(f);
		BufferedReader bufferedR = new BufferedReader(reader);
		String data;
		if((data=bufferedR.readLine()) !=null) {
			System.out.println(data);
		}
		bufferedR.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}
		
		//NIO 
		System.out.println("***************************************************************************");
		//https://attacomsian.com/blog/java-read-write-files-nio-api
		//bytes
		try {
		byte[] bytes = Files.readAllBytes(Paths.get(fname)); 
		//convert bytes to string
		String content = new String(bytes);
		//print contents 
		System.out.println(content);}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		//read all lines
		try {
			List<String> lines =  Files.readAllLines(Paths.get(fname));
			for(String line : lines) {
				System.out.println(line);
			}
			
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		//Stream API 
		try {
			//initialize lines stream 
			Stream<String> stream = Files.lines(Paths.get(fname));
			stream.map(String::trim)
					.filter(l -> !l.isEmpty())
					.forEach(System.out::println);
			stream.close();
					
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		/* links
		 * https://javapapers.com/java/java-nio-file-read-write-with-channels/ 
		 * https://jenkov.com/tutorials/java-nio/nio-vs-io.html
		 * https://medium.com/@nilasini/java-nio-non-blocking-io-vs-io-1731caa910a2*/
	}
}
