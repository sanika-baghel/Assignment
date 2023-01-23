package com.palindrome;

import java.util.*;

public class ReverseNumb {
	public static void main(String[] args) {
		int s = 0, d, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		n = sc.nextInt();
		while (n > 0) {
			d = n % 10;
			s = s * 10 + d;
			n = n / 10;
		}
		System.out.println("reverse no is " + s);
	}
}