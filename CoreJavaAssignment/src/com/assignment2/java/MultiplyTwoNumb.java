package com.assignment2.java;

import java.util.*;

public class MultiplyTwoNumb {
	static int multiply(int x, int y) {
		if (y == 0) {
			return 0;
		}
		if (y > 0) {
			return (x + multiply(x, y - 1));
		}
		if (y < 0) {
			return -multiply(x, -y);
		}
		return -1;
	}

	public static void main(String[] args) {
		int ans = 0, num, noOftimes;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		num = sc.nextInt();
		noOftimes = sc.nextInt();
		System.out.print(multiply(num, noOftimes));
	}
}