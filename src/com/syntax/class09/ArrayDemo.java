package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] num =new int[5] ;
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access element from an array?
		System.out.println(num[3]);
		System.out.println(num[1]+num[4]);
		
		
		//I would like to change 50 to 100
		
		num[4]=100;
		System.out.println(num[4]);
		
		int[] array=new int[2];
		//array[0]=10.99; //will give error
		
		String[] greet=new String[4];
		greet[0]="Hello";
		greet[1]="Hi";
		greet[2]="Bye";
		greet[3]="Yay";
		
		System.out.println(greet[2]);
		
	}

}
