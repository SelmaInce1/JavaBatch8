package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"Toyota","Bmw","Honda","Mercedes","GM","Ford"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		System.out.println("Getting values from array using enhanced for loop");
		
		
		/*
		 * for (:name of the array)
		 * 
		 */
		for (String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println();
		System.out.println("Getting values from array using enhanced for loop");
		
		int[] numbers= {10,10,90,600,89};
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("Getting values from array using enhanced for loop");
		
		boolean[] arrayOfBoolean= {true,true,false,true};
		for (boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
		
	}

}
