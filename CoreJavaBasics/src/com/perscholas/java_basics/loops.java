package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class loops {

	public loops() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//Q1
		for(int i=1;i<=10;i++ ) {
			System.out.println(i);
		}
		//Q2
		int k=1;
		while(k<=10) {
			System.out.println(k * 10);
			k++;
		}
		//Q3
		int j = 11;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		
		//Q4
		for(int i=1;i<=100;i++) {
			if(i%5 == 0 && !(i>=25 && i<=75)) {
				System.out.println("Q4 "+i);
			}
			else {
				continue;
			}
		}
		//Q5
		for(int i=1;i<=100;i++) {
			if(i%5==0 && i<50) {
				System.out.println("Q5 :"+ i);
			}
			else if (i==50){
				break;
			}
		}
		
		// nice to see the number of column and row
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(c + " ");
			}
			System.out.println();
			
		}
		
		//Q6
		for(int week=1;week<=2;week++) {
			System.out.println("Week " + week+":");
			for(int day=1;day<=5;day++) {
				System.out.println("Day " + day);
				
			}
		}
		
		//Q7 Palindrom for numbers and string 
		//wrong logic 
		for(int i=10;i<=200;i++) {
			if(i%11==0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
		//for string work on it using decrement on string and concatenation
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a Word");
		String word = userInput.next() ;
		String reversedWord = "";
		for(int i=word.length()-1;i>=0;--i) {
			reversedWord += word.charAt(i);	
		}
		if(word.equals(reversedWord)) {
			System.out.println(word + " is Palindrom");
		}
		else {
			System.out.println("It is not palindrom :(");
		}
		
		
		
		System.out.println();
		
		System.out.println();
		//Q8 Fibonacci Sequence wrong logic here , the 3rd number is the sum of the previous 2 numbers
		int[] num50 = new int[51];
		for(int i =0;i<=50;i++) {
			num50[i] = i;
		}
		for(int index=0; index<num50.length-1;index++){
			if(index<=2) {
				System.out.println("Fibo :" +num50[index]);
			}
			else {
			int fibo = num50[index-1]+num50[index-2];
			System.out.println("Fibo :" + fibo);
			}
		}
		
		System.out.println();
		//prime numbers between 1-10 or more 
		int[] numbers = new int[11];
		for(int i=1;i<numbers.length;i++) {
			numbers[i] = i;
			
		}
		ArrayList notPrimes = new ArrayList();
		for(int i=1;i<numbers.length;i++) {
			for(int j1=1;j1<numbers.length;j1++) {
				if(numbers[i] % numbers[j1]==0) {
					if((numbers[i] != numbers[j1] && numbers[j1] != 1 && numbers[i] % numbers[j1] == 0)) {
					notPrimes.add(numbers[i]);
					}
				}
			}
		}
		
		for(int i=1;i<numbers.length;i++) {
			if(notPrimes.contains(numbers[i])) {
				continue;
			}
			else {
				System.out.println(numbers[i] + " is prime number");
			}
			
			
		}
		
		
		System.out.println();
		//Additional Question for consonant
				char[] vowels = {'a','e','u','i','o'};
				// Instream from stack overflow need to work on a better solution it did not work
		           ArrayList alphabet = new ArrayList(); // new array
		           
	               
		           for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
		           {
		               alphabet.add(ch);
		           } 
				Scanner input = new Scanner(System.in);
				System.out.println("Enter a letter");
				char letter = input.next().charAt(0);
				boolean nature = false;
				for(int i=0;i<vowels.length;i++) {
					if(alphabet.contains(letter) ) {
						if(letter == vowels[i] ) {
							nature = true;
							break;
						}
					}
					else {
						nature = false;
					}
				}
				
				if(nature) {
					System.out.println(letter + "It is a vowel");
				}
				else{
					System.out.println("It is a not vowel");
				}
		
		
	}
}
