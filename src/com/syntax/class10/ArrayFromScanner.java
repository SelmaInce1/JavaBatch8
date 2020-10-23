package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		//Let's ask user how many names he would like to store and  then store those names
		
		Scanner scan=new Scanner(System.in);
		System.out.println("how many names would you like to store");
		int size=scan.nextInt();
		
		String[] names=new String[size];
		for (int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		//we are retrieving values from an array
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]+" ");
			
		}
		
		

	}

}
