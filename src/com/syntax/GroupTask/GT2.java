package com.syntax.GroupTask;

public class GT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program to check whether 
		//a given number is prime or not?
		
		int  num=31; 
		int i=2;
		boolean ifPrime=false;
		 
		while (i<num) {
			if (num%i==0) {
				ifPrime=false;
				break;				
			}else {
				ifPrime=true;	
			}
			i++;
		}
		
		if (ifPrime==true) {
			System.out.println("The number "+num+ " is a prime number");
		}else {
			System.out.println("The number "+num+ " is not prime number");
		}
		
		
		///another method;
		//for (int i=2; i<num; i++){
		// if (num%i==0){
			//ifPrime=false;
			//break;
		
		
	}

}
