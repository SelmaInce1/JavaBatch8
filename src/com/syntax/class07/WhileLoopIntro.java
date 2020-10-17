package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		int time=15;
		while (time>12) {
			System.out.println("good day");
			time--;
		}
		
		//While Syntax
		//initialize variable;
		//While (true);
			//code;
			//increments variable 
		
		
		System.out.println("-------------");
		//numbers from 0 to 50
		
		int num=0;
		while (num<=50) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("-------------");	
		//numbers from 10 to 60
			
		int a=10;
		while (a<=60) {
			System.out.print(a+" ");
			a++;
			
		}
		
		System.out.println("-------------");	
		
		
		///I want print numbers from 100 to 60;
		
		int b=100;
		while (b>=60) {
			System.out.println(b);
			b--;
		}
		//numbers from 10 to 30 but even
		int c=10;
		while (c<31) {
			if (c%2==0) {
				System.out.println(c);
			}
			c++;
		}
		
		System.out.println("-------------");	
		//print numbers from 100 to 1 (odd numbers only)
		
		int d=100;
		while(d>=1) {
			if (d%2==1) {
				System.out.println(d);	
			}
		d--;
		}
		
		

	}

}
