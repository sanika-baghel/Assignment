//Write a method that checks if there is at least one pair of numbers whose sum equals the target.
//arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
package com.assignment2.java;

import java.util.*;

public class PairOfNumber {
	public static void pair(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.printf("pair (%d, %d) ", nums[i], nums[j]);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}

	public static void main(String[] args) {
		int[] no = { 1, 3, 4 };
		int target = 5;
		pair(no, target);
	}
}