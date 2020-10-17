package com.syntax.homework1;

import java.util.Scanner;

public class Q100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your city: ");
		String city=input.nextLine();
		
		System.out.println("Please enter your city's temperature in Fahrenheit: ");
		double temp=input.nextDouble();
		double celcius=((temp-32)*100)/180;
		
		System.out.println("The temperature in the city "+city+" is "+celcius);

	}

}
