package com.perscholas.softwaredevelopercoreprojects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClubMemberApp {
public static void main(String[] args) {
	SoftwareDeveloperClub club  = new SoftwareDeveloperClub();
	Scanner sc = new Scanner(System.in);
	
	
	try {
	//menu
	int choice = 0;
	while(choice !=4) {
	System.out.println("Select from the following menu: \n 1: Display Members\r\n"
			+ "2: Remove Member\r\n"
			+ "3: Add Member\r\n"
			+ "4: Quit\r\n" + "choose the number corresponding to the operation you want to do for example for adding type 3");
	
	choice = sc.nextInt();
	if(choice==1) club.display();
	else if (choice==2) club.remove();
	else if (choice==3) club.add();
	else if (choice == 4) System.exit(0);}
	if (choice == 4) System.exit(0);
	
	}
	catch(InputMismatchException e) {
		System.out.println("data type of the input is incorrect please try again");
	}
	
	finally {
		sc.close();
	}
}
}
