package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------While loop------");
		int a=10;
		//first we check condition
		while (a<15) {
			System.out.println("Hello");
			a++;
		}
		System.out.println("---------Do While loop-------");
		int b=10;
		//first do something
		do {
			System.out.println("Hi");
			b++;
		}while(b<15); //then check condition
		
		
	}

}
