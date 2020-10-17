package com.syntax.class06;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price=76;
		double total ;
		boolean sale= true;
		double discount;
		
		if (!sale) {
			System.out.println("No shopping");
		}else {
			
			if (price>=10 &&price<50) {
				discount=price*0.1;
				total=price-(price*0.1);
			}else if(price>=50 &&price<100) {
				total=price-(price*0.2);
				discount=price*0.2;
			}else if(price>=100 &&price<500) {
				total=price-(price*0.4);
				discount=price*0.4;
			}else if(price>=500) {
				total=price-(price*0.5);
				discount=price*0.5;
			}else {
				discount=0;
				total=price;
			}
		
			System.out.println("Your price is $"+ price+ " your discount is $"+ discount+" your total is $"+ total);
		
		}
	}

}
