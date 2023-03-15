package com.prorigo.JavaFeature;

public class NumericLitral {
	public static void main(String[] args) {

		int a = 10_00000; // Underscore in integral literal
		System.out.println("a = " + a);

		float b = 10.5_000f; // Underscore in floating literal
		System.out.println("b = " + b);

		int c = 0B10_10; // Underscore in binary literal
		System.out.println("c = " + c);

		int d = 0x1_1; // Underscore in hexadecimal literal
		System.out.println("d = " + d);

		int e = 01_1; // Underscore in octal literal
		System.out.println("e = " + e);
	}
}