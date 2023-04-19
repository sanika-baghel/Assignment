//Write a Java method (takes a number n as input) to displays an n-by-n matrix.
package com.assignment;

import java.util.*;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}