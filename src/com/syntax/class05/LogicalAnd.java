package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&& Logical and
		//|| Logical or
		
		
		/*if true&&true-->true
		 * true &&false-->false
		 * false&&true-->false
		 * false&&false-->false
		 */
		
		
		/*if number >1 but smaller than 10 -->small
		 * if number >11 but smaller than 100 -->medium
		 * if number>101 but smaller than 1000-->large
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter any number");
		int number=input.nextInt();
		
		if (number>0 && number<=10) {
			System.out.println("You entered small number");
		}else if (number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if (number>100 && number<=1000) {
			System.out.println("You entered large number");
		}
	

	}

}
