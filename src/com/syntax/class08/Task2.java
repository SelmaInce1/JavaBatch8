package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=1;
		for (int i=10; i>=1; i-=2) {
			result*=i;
		}
		
		System.out.println(result);
		
		
		System.out.println("------------------");

		//Calculate sum of even and odd numbers from range 1 to 50
		
		int SumEven=0;
		int SumOdd=0;
		for (int i=1; i<51; i++) {
			if (i%2==0) {
				SumEven+=i;
			}else {
				SumOdd+=i;
			}
		}
		System.out.println("Sum of even "+SumEven);
		System.out.println("Sum of odd "+SumOdd);
		
		System.out.println("------------------");
		
		//I want to create a multiplication table
		/*
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 * 
		 * 
		 * 1*10=10
		 */
		
		int num1=1;
		int mult;
		for (int i=1; i<=10; i++) {
			mult=num1*i;
			System.out.println(num1+"x"+i+" = "+mult);
		}
		
		
	}

	
}
