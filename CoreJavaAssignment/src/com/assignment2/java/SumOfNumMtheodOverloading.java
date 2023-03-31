package com.assignment2.java;

import java.util.*;

public class SumOfNumMtheodOverloading {
	void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers is " + sum);
	}

	void add(int... n) {
		int sum = 0;
		for (int no : n) {
			sum = sum + no;
		}
		System.out.println("Sum of numbers is " + sum);
	}

	public static void main(String[] args) {
		SumOfNumMtheodOverloading obj = new SumOfNumMtheodOverloading();
		//obj.add(15, 10);
		//obj.add(15, 1, 8);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many numb you want to add? ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the numbers ");
		for (int i = 1; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		obj.add(num);
	}
}