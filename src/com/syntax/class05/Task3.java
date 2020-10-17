package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based
		 *  on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your your quiz: ");
		int quiz=input.nextInt();
		System.out.println("Please enter your your midterm: ");
		int midterm=input.nextInt();
		System.out.println("Please enter your your final: ");
		int finalg=input.nextInt();
		
		int average=(quiz+midterm+finalg)/3;
		char grade;
		
		if (average>=90) {
			grade='A';
		}else if (average>=70 && average<90) {
			grade='B';
		}else if (average>=50 && average<70) {
			grade='C';
		}else if (average<50 && average>=40) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("Grade is = "+grade);
		
		if(grade=='A'||grade=='B') {
			System.out.println("You are good student");
		}else {
			System.out.println("Please study more");
		}
		
		System.out.println("------------------------------- ");
		
		
		/*Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		Example: if user is born in June, July or August → season =”Summer”.
		At the end of the program we should see output as 
		“You were born ______”.
		 * 
		 */
		
		System.out.println("Please enter your birth month in numbers: ");
		int month=input.nextInt();
		String season;
		season=" ";
		
		
		if (month>=1 && month<=2 ||month==12) {
			season="Winter";
		}else if (month>=3 && month<=5) {
			season="Spring";
		}else if (month>=6 && month<=8) {
			season="Summer";
		}else if (month>=9 && month<=11) {
			season="Fall";
		}
		
		System.out.println("You were born in "+season);
		
		//We can say month.equalsIgnoreCase("December")
		
		
	}

}
