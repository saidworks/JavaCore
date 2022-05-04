package com.perscholas.library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		LibraryUser sami = new KidUsers(10,"Kids");
		LibraryUser julie = new KidUsers(18,"Fiction");
		//Test case #1
		sami.registerAccount();
		julie.registerAccount();
		
		sami.requestBook();
		julie.requestBook();
		LibraryUser james = new AdultUser(5,"Kids");
		LibraryUser karl = new AdultUser(23,"Fiction");
		//Test case #2
				james.registerAccount();
				karl.registerAccount();
				
				james.requestBook();
				karl.requestBook();

	}

}
