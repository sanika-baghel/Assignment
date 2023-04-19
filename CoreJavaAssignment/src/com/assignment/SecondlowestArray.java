//write a program of java to print second lowest no of array
package com.assignment;

public class SecondlowestArray {
	static int arr[] = { 20, 10, 30, 50, 60, 55, 28, 58 };

	static int Secondlowest() {
		int min = arr[0];
		int min2 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min2 = min;
				min = arr[i];
			} else if (arr[i] < min2) {
				min2 = arr[i];
			}
		}
		return min2;
	}

	public static void main(String args[]) {
		System.out.println("second Lowest no : " + Secondlowest());
	}
}