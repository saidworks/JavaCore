package com.perscholas.library;

public class KidUsers implements LibraryUser {
	private int age;
	private String bookType;
	
	public KidUsers() {
		// TODO Auto-generated constructor stub
	}
	public KidUsers(int age, String bookType) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(this.age>12) {
			System.out.println("Sorry, Age must be less than 12 to  register as a kid");
		}
		else if(this.age>0 && this.age<12) {
			System.out.println("You have successfully  registered under a Kids Account");
		}
	}

	@Override
	public void requestBook() {
		if(bookType=="Kids") {
			System.out.println("Book Issued  successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only Kids books");
		}
		
	}

}
