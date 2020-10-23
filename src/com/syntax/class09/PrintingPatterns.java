package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		/*  *****
			*****
			*****
			*****
			*****
			*****		
		 * 
		 */
		
		
		for (int i=1; i<=5; i++) {  ///for rows {outer}
			for (int j=1; j<=5; j++) { ///for columns {inner}
				System.out.print("*");
			}
			
			System.out.println();
				
		}
		
		System.out.println("----------------------");
		
		for (int r=1; r<=4; r++) {  ///for rows
			for (int c=1; c<=6; c++) { ///for columns
				System.out.print("*");
			}
			
			System.out.println();
				
		}
		
		System.out.println("----------------------");
		
		for (int r=1; r<=6; r++) {  ///for rows
			for (int c=1; c<=12; c++) { ///for columns
				System.out.print("$");
			}
			
			System.out.println();
				
		}
		
		System.out.println("----------------------");
		
		/*  12345
			12345
			12345
			12345
			12345
		 * 
		 */
		
		for (int r=1; r<=5; r++) {  ///for rows
			for (int c=1; c<=5; c++) { ///for columns
				System.out.print(c);
			}
			
			System.out.println();
		
		}
		
		System.out.println("----------------------");
		
		/*  11111111
			22222222
			33333333
			44444444
		 * 
		 */
		
		for (int r=1; r<=4; r++) {  ///for rows
			for (int c=3; c<=10; c++) { ///for columns
				System.out.print(r);
			}
			
			System.out.println();
			
		}
		
		System.out.println("----------------------");
		
		/*  777777
			666666
			555555
			444444
			333333
			222222
			111111
		 * 
		 */
		

		for (int r=7; r>=1; r--) {  ///for rows
			for (int c=3; c<=8; c++) { ///for columns
				System.out.print(r);
			}
			
			System.out.println();
			
		
		}
		
		System.out.println("----------------------");
		
		
		
			
		
	}
}
