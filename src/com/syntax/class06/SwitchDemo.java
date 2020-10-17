package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Lets ask a tester on which browser they would like to use
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		String browser;
		String message;
		
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on Firefox browser";
			break;
		default:
			message="Entered browser is not supported";
		}
		
		System.out.println(message);
		
		
		////SWITCH CAN NOT WORK WITH DOUBLE,FLOAT,LONG
		
		float f=10.99f;
		double d=19.90;
		long l=19099;
		///switch(l or d or f) {
		//CE:- Cannot switch on a value of type double. 
		//Only convertible int values, strings or enum variables are 
		//permitted

	}

}
