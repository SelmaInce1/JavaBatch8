package com.syntax.homework1;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Is it sunny outside? ");
		
		boolean sunny=input.nextBoolean();
		
		
		if (sunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
		
			System.out.println("What is the temperature outside?");
			int temp=input.nextInt();
				if (temp>85) {
					System.out.println("I am going to the beach!");
				}else {
					System.out.println("I am going to the park");
				}
			
		}else {
			System.out.println("I stay home and practice Java!");
		}

	}

}
