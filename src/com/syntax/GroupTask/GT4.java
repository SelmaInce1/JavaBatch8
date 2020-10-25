package com.syntax.GroupTask;

import java.util.Arrays;

public class GT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maximum and minimum number in the array?
		
		int[]array= {5,13,16,78,-10,167};
		
		int max=array[0];//max number;
		
		for(int i=1;i<array.length;i++) {
		
			
			if(array[i]>max) {
				max=array[i];	
			}
			}
			System.out.println(" The max number is "+max);
		
			
			//min number;
			int min=array[0];
			for (int i=1;i<array.length;i++) {
			
			if (array[i]<min) {
				min=array[i];
			}
			}
			System.out.println(" The min number is "+min);
			
			
			//another method;
			Arrays.sort(array);
			System.out.println(" The min number is "+array[0]);
			System.out.println(" The min number is "+array[array.length-1]);


	}

}
