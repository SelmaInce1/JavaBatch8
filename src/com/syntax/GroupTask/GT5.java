package com.syntax.GroupTask;

import java.util.Arrays;

public class GT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a java program to find the second largest
		//number in the array?
		
		double[] array = {1,5,10,3,6};
		int length=array.length;
		Arrays.sort(array);
		System.out.println("Second highest number is "+array[length-2]);
		
		//Write a java program to find the second largest
		//number in the array without using sort function?
		
		int[] myArray= {66,45,65,965,32,876,900};
		int max=myArray[0];
		int secondmax=0;
		
		for (int i=0; i<myArray.length; i++) {
			if (myArray[i]>max) {
				secondmax=max;
				max=myArray[i];
			}else if(myArray[i]>secondmax && myArray[i]!=max) {
				secondmax=myArray[i];
			}
				
		}
		
		System.out.println("the largest number in array is :"+max);
		System.out.println("the 2nd largest number in array is :"+secondmax);
}
}