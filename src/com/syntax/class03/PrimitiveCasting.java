package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d=12/7;//widening
		System.out.println(d);
		
		double e=9;//widening
		System.out.println(e);
		
		//int i=9.99; No possibility.
		
		//Casting in Java-->converting 1 type to another
		//2 types of casting:
		
		//widening-implicit (automatic)
		//byte->short->int->long->float->double
		
		//narrowing -explicit (manual)
		//double->float->long->int->short->byte
		
		int i=(int)9.99;//narrowing
		System.out.println(i);
		
		byte b=(byte)130;//narrowing
		System.out.println(b);
		
	}

}
