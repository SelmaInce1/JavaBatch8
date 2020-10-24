package com.syntax.homeworks;



public class Q46 {

	public static void main(String[] args) {
		
		double discount;
		char code = 'C' ;
		System.out.println(code);
		switch ( code ) {
		case 'A':
		discount = 0.0;

		case 'B':
		discount = 0.1;

		case 'C':
		discount = 0.2;

		default:
		discount = 0.3;
		}
	
		System.out.println(discount);
	}   
	    
}   


