package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 way to create a variable
		
		//create variable= assigning value
		//declare a variable= initializing
		
		double $num=12.99;
		
		//2 way to create a variable
		//declare a variable
		//initialize or asking value
		
		
		int myBox;//we declare variable at once
		//int myBox=135; ///it gives error because we declare it before
		myBox=135;
		
		myBox=155;// reassigning value
		System.out.println(myBox);
		
		//3 way
		int num1, num2, num3;// if variable is the same type, we can 
		//declare all in one line
		num1=10;
		num2=20;
		num3=30;
		
		
		//what will be the output?
		char char1='C';
		char char2='d';
		
		char char3=char1;
		System.out.println(char3);
		
		
	}


}
