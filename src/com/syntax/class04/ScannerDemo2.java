package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();//I am waiting for your input
		//and then hit Enter when you are done
		
		if (rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It is a nice weather go for a walk");
		}
		
		System.out.println("-------LETs capture integer value------------");

	}

}
