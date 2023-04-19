//Write a program to first 10 the elements of Fibonacci series.
package com.assignment;

public class Fibonacci {
	public static void main(String[] args) {
		int no1, no2, no3;
		no1 = 0;
		no2 = 1;
		System.out.print(no1 + " " + no2);
		for (int i = 1; i <= 10 - 2; i++) {
			no3 = no2 + no1;
			System.out.print(" " + no3);
			no1 = no2;
			no2 = no3;
		}
	}
}