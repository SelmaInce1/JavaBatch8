package com.syntax.homework1;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		
		int num1 = userIn.nextInt();
		int num2 = userIn.nextInt();
		int num3 = userIn.nextInt();
		
		if (num1>num2) {
			if(num1>num3) {
				System.out.println("The largest number is "+num1);
			}else {
				System.out.println("The largest number is "+num3);
			}
		}if (num2>num1) {
			if(num2>num3) {
				System.out.println("The largest number is  "+num2);
			}else {
				System.out.println("The largest number is "+num3);
			}
		
			/*We  can say if(!(num1==num2 &&num2==num3)) or
			 * if (num1!=num2 && num2!=num3){
			 * 
			 * 		if (num1>num2)&&num1>num3){
			 * 			max=num1;
			 * 		}else if (num2>num3){
			 * 			max=num2;
			 * 		}else{
			 * 			max=num3;
			 * }else {
			 * 		System.out.println("Numbers are equal");
			 */
			
			////For closing the scanner
			//scanner.close();
				
	}

}
}