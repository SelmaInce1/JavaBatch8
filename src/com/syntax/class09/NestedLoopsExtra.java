package com.syntax.class09;

public class NestedLoopsExtra {

	public static void main(String[] args) {
		
		System.out.println("How can I print car odometer nested loops");
		
		for (int a=0; a<=9; a++) {
			for (int b=0; b<=9; b++) {
				for (int c=0; c<=9; c++) {
					for (int d=0; d<=9; d++) {
						for (int e=0; e<=9; e++) {
							System.out.println(a+""+b+""+c+""+d+""+e);
						}
					}
				}
			}
			
		}
	}

}
