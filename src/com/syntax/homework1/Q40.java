package com.syntax.homework1;

import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String inst=input.nextLine();
		String message;
		
		switch(inst.toLowerCase()) {
		case "asghar":
			message="Will take care of Java Assignment";
			break;
		case "moazam":
			message="Will take care of SDLC Assignment";
			break;
		case "weqas":
			message="Will take care of Selenium Assignment";
			break;
		case "asel":
			message="Will take care of every Assignment";
			break;
		default:
			message="Invalid instructor selected";
		}
		
		System.out.println(message);
		

	}

}
