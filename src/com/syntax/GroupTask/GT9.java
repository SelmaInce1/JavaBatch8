package com.syntax.GroupTask;

public class GT9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of countries:
		//north america countries, south america countries,
		//europe countries, asian countries, african countries. 
		//Then print all values from that array using 2 different loops
		//and calculate how many total countries been stored.
		
		int sum=0;
		String[][]country= {
				{"Mexico","America","Canada"},
				{"Brazil","Argentina","Peru","Chile"},
				{"Britain","France","Germany","Spain"},
				{"Chad","Nigeria","Egypt","South Africa"},
				{"India","Russia","China","Pakistan"}
		};
			for(int i=0; i<country.length; i++) {
				for(int j=0; j<country[i].length;j++) {
					System.out.print(country[i][j]+"   ");
					sum=country.length*country[j].length-1;
				}System.out.println();
			}
			System.out.println(sum);
			
			
			System.out.println("----------------------");
			
			int sum2=0;
			for (String[] c: country) {
				for (String name: c) {
					sum2++;
				}
				System.out.println();
			}
			
			
			System.out.println(sum2);
		
	}

}
