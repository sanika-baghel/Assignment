package com.prorigo.test;

import java.util.*;

public class AnagramWithoutArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String  ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second String  ");
		String s2 = sc.nextLine();
		if (checkAnagram(s1, s2))
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
		sc.close();
	}
	public static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}
			if (s2.length() == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}