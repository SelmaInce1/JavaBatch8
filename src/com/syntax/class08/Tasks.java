package com.syntax.class08;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=20; i>=1; i--) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println("------------------");
		
		for (int i=20; i>1; i-=2) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("------------------");
		
		for (int j=20; j<=50; j++) {
			if (j%2==1) {
				System.out.print(j+" ");
			}
		}
		
		System.out.println("------------------");
		
		for (int j=21; j<=50; j+=2) {
			System.out.print(j+" ");
			
		}
		
		

	}

}
