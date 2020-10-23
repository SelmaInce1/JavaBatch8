package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] array= {'A','B','C','D','E','F'};
		System.out.println(array[1]);
		
		char[] array2 = new char[6];
		array2[0] = 'A';
		array2[1] = 'B';
		array2[2] = 'C';
		array2[3] = 'D';
		array2[4] = 'E';
		array2[5] = 'F';
		
		System.out.println(array[1]);
		
		System.out.println("---------------------");
		
		String[] names1= {"Sergi","Sergiy","Selma","Siham"};
		System.out.println(names1[2]);
		
		String[] names2 = new String[4];
		names2[0] = "Sergi";
		names2[1] = "Sergiy";
		names2[2] = "Selma";
		names2[3] = "Siham";
		
		
		System.out.println(names2[2]);
		
		System.out.println("---------------------");
		

		String[] s1= {"Java","Saturday","day","coding","is"};
		System.out.println(s1[1]+" "+s1[4]+" "+s1[0]+" "+s1[3]+" "+s1[2]);
	
	
	
		System.out.println("---------------------");
		
		
		
		System.out.println("---------HW1------------");
		
		int[] numbers= {12,34,23,56,78};
		int sums=0;
		for (int i=0; i<numbers.length; i++) {
			sums+=numbers[i];
		}
		System.out.println(sums);
		
		System.out.println("---------HW2------------");
		
		
		String[] animals= {"Dog","Cat","Monkey","Elephant","Giraffe","Bear"};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		
		//or with different loop
		
		for (String animal:animals) {
			System.out.println(animal);	
			
		}
		
		
		System.out.println("-------HW3--------------");
		
		double[] doubles= {12.94,34.65,23.25,56.23,78.14};
		double sumDouble=0;
		for (int i=0; i<doubles.length; i++) {
			sumDouble+=doubles[i];
		}
		System.out.println(sumDouble);
		
		
		System.out.println("---------HW4------------");
		
		
		
		
		String[] countries= {"USA", "Germany", "Turkey", "Russia", "Greece"};
		String[] capitals= {"Washington DC", "Berlin", "Ankara", "Moscow", "Athen"};
		
		for (int i=0; i<countries.length; i++) {
			System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
		}
		
		
		
		
		
		
		
	
			
		}	
		}
		
	

