//Java Program to Swap Two Numbers Using Bitwise Operator
package com.assignment2.java;

import java.util.*;

public class SwapBitwise {
	public static void main(String args[]) {
		int no1, no2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no1 ");
		no1 = sc.nextInt();
		System.out.print("Enter no2 ");
		no2 = sc.nextInt();
		no1 = no1 ^ no2;
		no2 = no1 ^ no2;
		no1 = no1 ^ no2;
		System.out.println("no1 = " + no1);
		System.out.println("no2 = " + no2);
	}
}