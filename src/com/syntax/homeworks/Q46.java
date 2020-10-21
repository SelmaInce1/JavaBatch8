package com.syntax.homeworks;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		
		Scanner inp;
	    int x; 
	    System.out.print("In:");
	    
	    inp=new Scanner(System.in);
	    x=inp.nextInt();
	    
		for (int a=(x-1); a>=0; a--) {
			System.out.print(a+" ");
		}
			
	
	}


}