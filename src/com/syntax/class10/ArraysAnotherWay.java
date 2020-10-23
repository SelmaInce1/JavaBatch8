package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Mike","Burcu","Jack","Danilo","Bryan","Evgeniya"};
	
		//String[] names;
		//names= {"Sabeen"}; we can not do it in 2 steps this way
		
		System.out.println(names[3]);
		
		//how do I know how many elements I have in the array
		
		int size=names.length;
		System.out.println(size);
		
		System.out.println(names[names.length-2]);
		
		int a=2;
		
		System.out.println(names[a]);
	
		a+=2;
		System.out.println(names[a]);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("--------------------");
		for(int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
	}

}
