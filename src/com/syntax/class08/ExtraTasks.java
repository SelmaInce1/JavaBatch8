package com.syntax.class08;

import java.util.Scanner;

public class ExtraTasks {

	public static void main(String[] args) {
		for (int i=1; i<51; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("------------------- ");
		
		Scanner scan=new Scanner(System.in);
		String response;
		do {
			System.out.print("Do you want to apply for credit car ");
			response=scan.nextLine();
		}while (!response.equalsIgnoreCase("yes"));
		
		System.out.print("You are selected ");
	
		System.out.println("------------------- ");
		
		
		
		
		
		
		System.out.print("Please enter start point of range");
		int start=scan.nextInt();
		System.out.print("Please enter end point of range");
		int end=scan.nextInt();
		int SumEven=0;
		int SumOdd=0;
		for (int i=start; i<end; i++) {
			if (i%2==0) {
				SumEven+=i;
			}else {
				SumOdd+=i;
			}
			
		System.out.println("Sum of even "+SumEven);
		System.out.println("Sum of odd "+SumOdd);
		
		}
		
		
		System.out.println("------------------");
		
		
		
		
		System.out.print("Please enter the amount of the item you want");
		int amount=scan.nextInt();
		
		System.out.print("How much money will you pay");
		int pay=scan.nextInt();
		int diff=0;
		
		while (amount>pay) {
				System.out.print("You should pay more ");
				int more=scan.nextInt();
				pay=pay+more;
		}
		if (amount>pay) {
			diff=pay-amount;
				System.out.print("Here is your change $ "+diff);
		}
			
		System.out.println("Thank you for shopping");
		
		
		
		
		
		
		
		
		
		

	}

}
