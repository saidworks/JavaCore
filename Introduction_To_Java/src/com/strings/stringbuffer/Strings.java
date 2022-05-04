package com.strings.stringbuffer;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I am a string";
		System.out.println(a.replace("a", "b"));
		
		StringBuffer b = new StringBuffer(50);
		b.append("I am string buffer");
		System.out.println(b);
	}

}
