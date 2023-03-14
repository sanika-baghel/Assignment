//Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
package com.assignment.java;

import java.io.*;
import java.util.*;

public class TripletsSumZero {
	static void Triplets(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		Triplets(arr, n);
	}
}