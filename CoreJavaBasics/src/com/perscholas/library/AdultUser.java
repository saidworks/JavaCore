package com.perscholas.library;

public class AdultUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public AdultUser() {
		// TODO Auto-generated constructor stub
	}
	public AdultUser(int age, String bookType) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(this.age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else if(this.age>0 && this.age<12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		if(bookType=="Fiction") {
			System.out.println("Book Issued  successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult  Fiction books");
		}
		
	}

}
