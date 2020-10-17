package com.syntax.homework1;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter the length ");
		int length=input.nextInt();
		
		System.out.print("Please enter the width ");
		int width=input.nextInt();
		
		if (length==width) {
			System.out.println("The shape of your object is square");
		}else {
			System.out.println("The shape of your object is rectangle");
		}

	}

}
