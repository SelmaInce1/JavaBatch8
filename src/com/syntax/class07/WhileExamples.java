package com.syntax.class07;

public class WhileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
			if (day<6) {
				System.out.println("I need a day off");
				
			}else {
				System.out.println("I dont need a day off");
				workDay=false;
		}
			day++;
		}
			
			
		
		

	}

}
