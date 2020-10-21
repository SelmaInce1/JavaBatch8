package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		///Ask user what is his name 5 times---> print hello
		//+name
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int number=1;
		
		while(number<=5) {
			System.out.println("Please tell me your name");
			name=scan.nextLine();
			System.out.println("Nice to meet you "+name);
			System.out.println("------------------");
			number++;
		}
			
			System.out.println("---------------------");
			//play a lottery where we need to enter number from 1 to 100
			//lucky number is 7
			
			
			int luckyNumber=7;
			int num2;
			
			do  {
				System.out.println("Please enter lucky number");
				num2=scan.nextInt();
			}while  (num2!=luckyNumber);
			
			System.out.println("You guessed the right number");
			
			
			
			
	
			
			///OR
			System.out.println("Please enter lucky number");
			num2=scan.nextInt();
			
			while (num2!=luckyNumber) {
				System.out.println("Please enter lucky number");
				num2=scan.nextInt();
				
			}
			System.out.println("You guessed the right number");
			
			
			
			
		}
		
		

	

}

