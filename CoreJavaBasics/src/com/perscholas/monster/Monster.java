package com.perscholas.monster;

public class Monster {
	private String name;
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	String attack() {
		if(this.name != "u2u2") {
			 return "Run "+ this.getClass().getSimpleName() +"'s Attack";
			}
			else {
				return "garbage!!!";
			}
	}
	
}
