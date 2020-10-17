package com.syntax.homework1;

import java.util.Scanner;

public class Q44 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car=input.nextLine();
		String carOrigin;
		
		switch(car.toLowerCase()) {
		case "bmw":
			carOrigin="german car";
			break;
		case "toyota":
			carOrigin="japanese car";
			break;
		case "maserati":
			carOrigin="italian car";
			break;
		default:
			carOrigin="unknown";
		}
		
		System.out.println("Your favorite car is "+carOrigin);

	}

}
