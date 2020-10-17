package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=input.nextLine();
		
		
		System.out.println("Please enter your age: ");
		int age=input.nextInt();
		System.out.println("Your name is "+name+", you are "+age+" years old.");
	}
	}


