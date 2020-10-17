package com.syntax.homework1;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1=input.nextLine();
		String word2=input.nextLine();
		
		
		System.out.println("Please enter two numbers");
		int int1=input.nextInt();
		int int2=input.nextInt();
		
		String output=" ";
		
		if ((word1.equals(word2)) && int1==int2) {
			output="AND";
		}else if (int1==int2 || (word1.equals(word2))) {
			output="OR";
		}else if (!(int1==int2 && (word1.equals(word2)))) {
			output="NONE";
		}
		

		System.out.println(output);

}
}
