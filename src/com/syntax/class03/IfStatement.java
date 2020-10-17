package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=180;
		int num2=900;
		
		System.out.println("Writing my first if statement");
		
		if (num1>num2) {
			System.out.println("Num1 is bigger than num2");
		}
		
		System.out.println("End of if statement");
		
		System.out.println("----------------");
		
		
		int temp=70;
		if (temp>80) {
			System.out.println("I am going to the beach");
		}else {
			System.out.println("I will go for a walk");
		}
		
		double expectedHours=15;
		double actualHours=2;
		
		if (actualHours>expectedHours) {
			System.out.println("You will love the course and you will succeed");
		} else {
			System.out.println("Course will be too hard for you");
		}
		
		System.out.println("--------------------");
		
		boolean sleepy=false;
		//if not sleepy-->I will study otherwise I will take a nap
		
		if (sleepy==true) {
			System.out.println("I will take a nap");
		}else {
			System.out.println("I will study some Java");
		}

		
		boolean hungry=false;
		
		if (hungry) {
			System.out.println("I will go eat");
		}else {
			System.out.println("I will continue studying");
		}
	}

}
