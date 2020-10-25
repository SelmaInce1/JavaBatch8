package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create a 2D array where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String [][] array= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
			
		};
		
	
		System.out.println((array[0][1])+" "+(array[1][0]));
		System.out.println((array[0][0])+" "+(array[1][3]));
		System.out.println((array[0][2])+" "+(array[1][2]));
		System.out.println((array[0][3])+" "+(array[1][1]));
			
		
		
		//Create an array of cars : american, german, korean, italian. 
		//And print all values from a 2D array
		
		String[][] cars= {
				{"Jeep","Ford","Dodge"},
				{"Audi","Porche","Bmw"},
				{"Kia","Hyndai","Sonata"},
				{"Ferrari","Maserati","Lamborghini"},
		};
		
		for (int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		for (String[] carArray:cars) {
			for (String car:carArray) {
				System.out.println(car+" ");
			}
			System.out.println();
		}
	}

}
