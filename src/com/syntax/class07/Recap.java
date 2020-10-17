package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		
		String month="January";
		//if month is december ==>February (Winter)
		
		
		switch (month) {
		case "January":
		case "December":
		case "February":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June": 
		case "July": 
		case "August":
			System.out.println("Summer");
			break;
		case "September":
		case "October":
		case "November":
			System.out.println("Fall");
			break;
		}

	}

}
