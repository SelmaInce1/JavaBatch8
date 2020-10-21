package com.syntax.class08;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
		
		//we want to print numbers from 1 to 10
		//when number is 5 we want to break the loop
		
		for (int j=1; j<=10; j++) {
			if (j==5) {
				break;
			}
			System.out.println(j);
		}
		
		
		//CONTINUE FOR SKIP 1 ITERATION
		
		//I want to print numbers from 1 to 5 except number 3
		
		for (int i=1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		//I want to print numbers from 1 to 10 except number 3&7
		
		for (int i=1; i<=10; i++) {
			if (i==3 || i==7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
