package com.syntax.homework1;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean ifWeekend=input.nextBoolean();
		String subject;
		
		if (!ifWeekend) {
			subject="Manual testing";
		}else {
			subject="Java";
		}
		
		
		System.out.println("Today you will be learning "+subject);
	}
	
		

	

}

