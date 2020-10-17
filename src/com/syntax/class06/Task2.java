package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Allow user to enter grade and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
		 * Not Acceptable. At the end your program should print which grade
		 *  was entered by a user with explanation.
		 *
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your grades: ");
		char grade=input.next().charAt(0);
		String message;
		
		
		switch(grade) {
		case 'A':
			message="excellent";
			break;
		case 'B':
			message="good";
			break;
		case 'C':
			message="average";
			break;
		case 'D':
			message="bad";
			break;
		default:
			message="Not acceptable";
		}
		
		System.out.println(message);
		
		
		

	}

}
