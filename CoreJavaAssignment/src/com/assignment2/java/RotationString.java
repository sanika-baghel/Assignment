package com.assignment2.java;

import java.util.*;

public class RotationString {
	public static boolean checkRotation(String st1, String st2) {
		if (st1.length() != st2.length()) {
			return false;
		}
		String st3 = st1 + st1;
		if (st3.contains(st2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (checkRotation(str1, str2)) {
			System.out.println("Yes " + str2 + " is rotation of " + str1);
		} else {
			System.out.println("No " + str2 + " is not rotation of " + str1);
		}
	}
}