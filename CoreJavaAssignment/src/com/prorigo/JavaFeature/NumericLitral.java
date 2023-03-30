package com.prorigo.JavaFeature;

public class NumericLitral {
	public static void main(String[] args) {

		int a = 10_00000; // Underscore in integral literal
		System.out.println("a = " + a);

		float b = 10.5_000f; // Underscore in floating literal
		System.out.println("b = " + b);

		int c = 0B10_10; // Underscore in binary literal
		System.out.println("c = " + c);

	}
}