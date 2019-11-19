package edu.gyansetu.tcs.wrapper;

import java.math.BigDecimal;

public class WrapperClass1 {

	public static void main(String[] args) {

		Integer num1 = 123; // Integer.valueOf(123)
		Integer num2 = new Integer(123);
		Integer num3 = new Integer("1234");

		// unboxing : wrapper - primitive
		// auto boxing : primitive - wrapper

		int num11 = num1;
		// num1.intValue(); //unboxing

		System.out.println(num1 + num2);

		// -128-127 : value cache
		Integer i1 = 1000; // .valueOf
		Integer i2 = 1000; //

		if (i1 == i2) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		String mobileNum = null; // Long 4565656767777

		Long mobNum = Long.parseLong(null);
		if (mobNum % 2 == 0) {
			System.out.println("even mobile");
		} else {
			System.out.println("odd mobile");

		}
		
		//BigDecimal bigDecimal = new BigDecimal(25435345);

	}

}
