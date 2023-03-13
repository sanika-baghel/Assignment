//To find the difference between the maximum and minimum number in an array.
package com.prorigo.test;

import java.util.Scanner;

public class MaxminArray {
	int MAX(int[] Arr) {
		int maxValue = Arr[0];

		for (int i = 1; i < Arr.length; i++) {
			if (Arr[i] > maxValue) {
				maxValue = Arr[i];
			}
		}
		return maxValue;
	}

	int MIN(int[] Arr) {
		int minValue = Arr[0];

		for (int i = 1; i < Arr.length; i++) {
			if (Arr[i] < minValue) {
				minValue = Arr[i];
			}
		}
		return minValue;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array elements:");
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter elements" + (i + 1));
			arr[i] = sc.nextInt();
		}

		MaxminArray obj = new MaxminArray();
		System.out.println("Maximum value in the array is " + obj.MAX(arr));
		System.out.println("Minimum value in the array is " + obj.MIN(arr));
		int diff = obj.MAX(arr) - obj.MIN(arr);
		System.out.print("Difference between max and min elements is  " + diff);
	}
}