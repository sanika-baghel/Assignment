//Write a Java method to print characters between two characters (i.e. A to P )﻿
package com.assignment;

public class TwoCharacter {
	public static void main(String[] args) {
		print_Chars('(', 'z', 20);
	}

	public static void print_Chars(char char1, char char2, int n) {
		for (int a = 1; char1 <= char2; a++, char1++) {
			System.out.print(char1 + " ");
			if (a % n == 0)
				System.out.println("");
		}
		System.out.print("\n");
	}
}