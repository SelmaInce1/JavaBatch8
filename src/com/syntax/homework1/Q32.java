package com.syntax.homework1;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Please enter your gender: M or F ");
		char gender=scan.next().charAt(0);
		
		System.out.print("Please enter your age ");
		int age=scan.nextInt();
		
		if (age>20) {
			if (gender=='F') {
				System.out.println("Woman");
			}else {
				System.out.println("Man");
			}
		}else {
			if (gender=='F'){
				System.out.println("Girl");
			}else {
				System.out.println("Boy");
			}
		}
		

	}

}
