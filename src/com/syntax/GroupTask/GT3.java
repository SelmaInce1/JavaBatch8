package com.syntax.GroupTask;

public class GT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to print the first 10 numbers
		//of Fibonacci series.
		
		
		// Each number is the sum of the two preceding ones 
				// Sequence start from 0
				int num1=0;
				int num2=1;
				
				
				for (int x=1; x<=10; x++) {
					System.out.print(num1+" ");	
					int sum =(num1+num2);
					num1=num2;
					num2=sum;
				}
		
		

	}

}
