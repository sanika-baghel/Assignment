//. Given an array of distinct Names, sort each Name from the list(Ascending order) and prepare a new list.
//Sort the newly prepared list in Descending order. 
package com.assignment.java;

import java.util.Arrays;

public class SortArray {
	public static void main(String args[]) {
		String[] countries = { "Pune", "Mumbai", "Nagpur", "Nashik", "Yavatmal", " Aurangabad", "Dhule"};
		int size = countries.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < countries.length; j++) {
				if (countries[i].compareTo(countries[j]) > 0) {
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < countries.length; j++) {
				if (countries[i].compareTo(countries[j]) < 0) {
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
	}
}