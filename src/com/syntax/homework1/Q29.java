package com.syntax.homework1;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter first number ");
		int first=input.nextInt();
		
		System.out.print("Please enter second number ");
		int second=input.nextInt();
		
		if ((first*second)>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
