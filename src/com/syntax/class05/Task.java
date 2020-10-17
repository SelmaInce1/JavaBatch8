package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter if you have a credit card: (yes/no)");
		String answer=input.next();
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance of your card?");
			double balance=input.nextDouble();
			if (balance>1000) {
				System.out.println("Please pay off your card balance");
			}else {
				System.out.println("You can spend more money");
			}
		}else {
			System.out.println("Would you like to get a credit card?");
		}
		
		System.out.println("--------------------------");
		
		
		/*Write a program to ask user to enter numbers of worked 
		 * years and annual salary. If user worked for more or 
		 * equals to 5 years than 
		 * 
		 * user is eligible for the bonus,
		 *  otherwise he is not. Once user is eligible 
		 *  and salary is larger than 50000 than bonus = 5000,
		 *   otherwise bonus=3000.
		 * 
		 */
		
		System.out.println("Please enter numbers of worked years: ");
		int years=input.nextInt();
		System.out.println("Please enter your annual salary: ");
		long salary=input.nextLong();
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus");
			if(salary>50000) {
				System.out.println("Bonus=5000");
			}else {
				System.out.println("Bonus=3000");
			}
		}else {
			System.out.println("You are not eligible for the bonus");
		}
		
		

	}

}
