package com.syntax.class04;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean diploma=false;
	boolean degree=true;
	double gpa=3.78;
	
	if (diploma) {
		System.out.println("Congratulations");
	}else {
		System.out.println("You should get a degree");
		if (degree) {
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
		}
	}
	
	System.out.println("---------------------------------");

	double mortgageRate=4.3;
	long housePrice=250000l;
	
	if (mortgageRate>4.5) {
		System.out.println("You will not buy a house");
	}else {
		System.out.println("I am thinking of buying a house");
		if (housePrice>200000) {
			System.out.println("you will take a loan");
		}else {
			System.out.println("Pay cash");
		}
			
	
	
	
	
	}
	
	System.out.println("---------------------------------");
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your age: ");
	int age=input.nextInt();
	
	if (age>=18) {
		System.out.println("Driver license will be issued to you");
	}else {
		System.out.println("You should get a learners permit");
	}
	
	
     /*
		System.out.println("---------------------------------");
	
	
	
	System.out.println("Please enter your city: ");
	String city=input.nextLine();
	
	System.out.println("Please enter your city's temperature in Fahrenheit: ");
	double temp=input.nextDouble();
	double celcius=((temp-32)*100)/180;
	
	System.out.println("The temperature in the city "+city+" is "+celcius);
	
	/*dogru fakat diger cevapta birseylerle cakisiyor
	 * 
	 */
	
	System.out.println("---------------------------------");
	
	System.out.println("Please enter the amount of the loan that you need: ");
	long money=input.nextLong();
	if (money<=200000) {
		System.out.println("We will lend the money");
	}else {
		System.out.println("You are rejected");
	}
}
}
