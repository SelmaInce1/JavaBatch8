package com.syntax.homework1;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter a number ");
		int value=input.nextInt();
		
		if ((value%2)==0) {
			System.out.println("Value is even");
			if (value>1000) {
				System.out.println("Even value is large");
			}else {
				System.out.println("Even value is just right");
			}
		}else {
			System.out.println("Value is odd");
		}
		

	}

}
