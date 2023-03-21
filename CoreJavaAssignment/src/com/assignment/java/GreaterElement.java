package com.assignment.java;

public class GreaterElement {
	public static void main(String argvs[]) {
		int arr[] = new int[] { 12, 16, 8, 92, 99, 1, 6, 19, 3 };
		int size = arr.length;

		System.out.print("The input array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");

		for (int i = 0; i < size; i++) {
			int no = -1;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] > arr[i]) {
					no = arr[j];
					break;
				}
			}
			if (no != -1) {
				System.out.println("The next greater element for the element " + arr[i] + " is: " + no);
			} else {
				System.out.println("The next greater element for the element " + arr[i] + " does not exist. ");
			}
		}
	}
}