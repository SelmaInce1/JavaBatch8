package com.syntax.class08;

import java.util.Scanner;

public class Recqp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//water price is 5
		//once user enters money than we need to tell if 
		// we need more or less money for water.
		int money;
		int waterPrice=5;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for water");
		money=scan.nextInt();
		
		 while (money!=waterPrice) {
			 if(money>waterPrice) {
				 System.out.println("This is too much, you need to enter less money");
				 
			 }else {
				 System.out.println("Water is expensive,please insert more money");
				 
			 }
			 money=scan.nextInt();
		}
		 System.out.println("Enjoy your water");
		 
		 System.out.println("-----------------------------");
		 
		 System.out.println("Please pay for water");
		 
			
		 do {
			 money=scan.nextInt();
			 
			 if(money>waterPrice) {
				 System.out.println("This is too much, you need to enter less money");
				 
			 }else {
				 System.out.println("Water is expensive,please insert more money");
			 }
			 //money=input.nextInt();
		 
		 }while(money!=waterPrice);
			 
		System.out.println("Enjoy your water");

	}

}
