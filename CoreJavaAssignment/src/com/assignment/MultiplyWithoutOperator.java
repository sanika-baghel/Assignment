//Write a Java program to multiply two given integers without using the multiply operator(*)
package com.assignment;

import java.util.*;

public class MultiplyWithoutOperator {
	public static void main(String args[]) {
		int ans = 0, num, noOftimes;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		num = sc.nextInt();
		noOftimes = sc.nextInt();
		for (int i = 1; i <= noOftimes; i++) {
			ans = ans + num;
		}
		System.out.println(ans);
	}
}