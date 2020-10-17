package com.syntax.homework1;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you need a loan?: ");
		boolean loan=input.nextBoolean();
		String eligibility=" ";
			
	  
	  if (loan){
	    System.out.println("What is your credit score?");
	    double score=input.nextDouble();
	    if (score<600){
	      eligibility="Not eligible";
	    }else if(score<=700 && score>=600){
	      eligibility="Maybe eligible";
	    }else if(score<=800 && score>=701){
	      eligibility="Eligible";
	    }else if (score>800){
	      eligibility="Definitely eligible";
	    }
	  }else{
	    eligibility="Unknown";
	  }
    
	  System.out.println("The eligibility is "+ eligibility);

}
}

