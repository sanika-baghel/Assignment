package com.assignment;

import java.util.*;

public class CommandLineWithException {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		float sum = a + b + c + d;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter divisible value");
		n = sc.nextInt();

		try {
			float f = sum / n;
			System.out.println("ans is " + f);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}