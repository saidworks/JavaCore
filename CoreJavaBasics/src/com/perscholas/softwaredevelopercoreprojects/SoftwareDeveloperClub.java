package com.perscholas.softwaredevelopercoreprojects;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SoftwareDeveloperClub {
	private ArrayList<ClubMember> clubMembers =  new ArrayList<>();
	private Scanner  sc = new Scanner(System.in);
	
	public SoftwareDeveloperClub(){
		try {
			  FileInputStream fileIn = new FileInputStream("members.txt");
			  BufferedReader br = new BufferedReader(new InputStreamReader(fileIn));
			  ArrayList<String[]> members =  new ArrayList<>();
			  
			  String line;
		      while ((line = br.readLine()) != null) {
		          if(line.contains("NAME")) {
		        	  continue;
		          }
		          else {
//		        	  line = line.replaceAll("\\*", " ");
		        	  String[] words = line.split("\\*");
		        	  members.add(words);
		          }
		      }
		      Iterator<String[]> elements = members.iterator();
		      while(elements.hasNext()) {
		    	  String[] current = elements.next();
//		    	  System.out.println(current[0]+current[2]+current[4]+current[6]);
		    	  clubMembers.add(new ClubMember(current[0],current[2],current[4],current[6]));
		      }
		      
		      
		      
		      fileIn.close();
			  }
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void display() {
		Iterator<ClubMember> elements = clubMembers.iterator();
		while(elements.hasNext()) {
			ClubMember member = elements.next();
			System.out.println("Member Name:" + member.getName());
			System.out.println("Location:" + member.getCity()+", "+member.getState());
			System.out.println("Favorite Language:" + member.getFavoriteLanguage());
			System.out.println();
		}
	
	}
	
	public void add() {
		String name,city,state,language;
		System.out.println("Enter member's name");
		name = sc.next();
		System.out.println("Enter member's city");
		city = sc.next();
		System.out.println("Enter member's state");
		state = sc.next();
		System.out.println("Enter member's language");
		language = sc.next();
		clubMembers.add(new ClubMember(name,city,state,language));
		
	}
	
	public void remove() {
		String name,city,state,language;
		System.out.println("Enter member's name");
		name = sc.next();
		System.out.println("Enter member's city");
		city = sc.next();
		System.out.println("Enter member's state");
		state = sc.next();
		System.out.println("Enter member's language");
		language = sc.next();
		clubMembers.forEach(m -> {
			if(m.getCity()==city && m.getFavoriteLanguage()==language 
					&& m.getName() == name && m.getState() == state) {
				clubMembers.remove(m);
			} 
			else {
				System.out.println("No member found with the given information");
			}
		});
	
	}
	
//	public static void main(String[] args) {
//		try {
//			  FileInputStream fileIn = new FileInputStream("members.txt");
//			  BufferedReader br = new BufferedReader(new InputStreamReader(fileIn));
//			  ArrayList<String[]> members =  new ArrayList<>();
//			  
//			  String line;
//		      while ((line = br.readLine()) != null) {
//		          if(line.contains("NAME")) {
//		        	  continue;
//		          }
//		          else {
////		        	  line = line.replaceAll("\\*", " ");
//		        	  String[] words = line.split("\\*");
//		        	  members.add(words);
//		          }
//		      }
//		      Iterator<String[]> elements = members.iterator();
//		      while(elements.hasNext()) {
//		    	  String[] current = elements.next();
//		    	  System.out.println(current[0]+current[2]+current[4]+current[6]);
//		    	  clubMembers.add(new ClubMember(current[0],current[1],current[2],current[3]));
//		      }
//		      
//		      
//		      
//		      fileIn.close();
//			  }
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//	}
}
