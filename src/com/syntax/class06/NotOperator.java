package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=!true;
		System.out.println(b);
		
		boolean anotherBoolean=!false;
		System.out.println(anotherBoolean);
		
		boolean isCold=true;
		
		if (!isCold) {
			System.out.println("I am going to the beach");
		}
	
	
		System.out.println("----------------------------");
		
		String day="Monday";
		
		if (!(day.equals("Sunday")||day.equals("Sunday"))) {
			System.out.println("I am going to work");
		}
		
		System.out.println("----------------------------");
		
		String str="Mohammad";
		String str1="mohammed";
		//str.equals(str1)-->False;
		//str.equalsIgnoreCase(str1)-->True;
		
		
		
			
	
	}	

}
