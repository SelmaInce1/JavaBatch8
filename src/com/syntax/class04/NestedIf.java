package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*variable for alergy -yes or no
		 * 
		 * if alergy is yes-->
		 * we will check if pet allergy 
		 * if peanut allergy 
		 * if pollen allergy
		 * 
		 * if no allergy you are lucky
		 */

		
		boolean allergy=true;
		boolean pet=false;
		boolean peanut=true;
		boolean pollen=false;
		
		if (allergy) {
			System.out.println("Let's do further check");
			if (pet) {
				System.out.println("Please no cats and dogs in the house");
			}else if (peanut==true) {
				System.out.println("Please do not eat peanut");
			}else {
				System.out.println("Please keep away from pollens");
			}
		} else {
			System.out.println("You are lucky");
		}
		
		
		System.out.println("----------------------------");
		
		/*
		 * if today is Friday we will watch movie but would like to check the date
		 *        if date is 13 -->watching scary movie
		 *        and if it is not --> I will watch comedy,action
		 *        
		 * if no Friday---> I am studying
		 * 
		 */
		
		boolean isFriday=false;
		int date=4;
		boolean monday=true;
		
		if (isFriday) {
			if (date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch Pk movie with AmirKhan");
			}
			
			
		}else {
			if (monday) {
				System.out.println("I am not studying, I am working");
			}else {
			System.out.println("I have class at Syntax");
		}
	}
		
		System.out.println("---------------------------------");
	        
			/*Check if assignment is completed
	         * if assignment is completed:
	         * 				if score>90 --> great job
	         * 				if score>80 --> good job
	         * 				if score>70 --> please study more
	         * 	
	         */
		
		boolean assignment=true;
		int score=92;
		
		if (assignment) {
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80){
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Please study more");
			}else {
				System.out.println("Good job for trying but you must study!");
			}
			
		}else {
			System.out.println("You should always complete all assignments");
		}

   }
}
