package com.syntax.homework1;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean ifThirsty=input.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean ifSleepy=input.nextBoolean();
		
		String drink;
		
		if (ifThirsty && !ifSleepy) {
			drink="Water";
		}else if (ifThirsty && ifSleepy) {
			drink="Coffee";
		}else if (!ifThirsty && ifSleepy) {
			drink="Tea";
		}else {
			drink="Nothing";
		}
		
		System.out.println("Looks like you need to drink "+drink);
		
		
		
		

	}

}
