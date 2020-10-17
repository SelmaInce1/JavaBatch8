package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your heights in inches: ");
		int height=input.nextInt();
		
		if (height<60) {
			System.out.println("Short");
		}else if (height>=60 && height<72){
			System.out.println("Medium");
		}else if (height>=72) {
			System.out.println("Tall");
		}
		
		System.out.println("----------------------");
		
		System.out.println("Please enter the day in numbers: ");
		int day=input.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It's a weekday");
		}else if (day==6 ||day==7) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("It's invalid day");
		}

	}

}
