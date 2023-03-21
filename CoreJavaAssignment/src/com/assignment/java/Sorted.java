package com.assignment.java;

import java.util.Arrays;

public class Sorted {
	public static void main(String args[]) {
		String[] countries = { "Pune" , "Mumbai" , "Nagpur", "Nashik" ,"Yavatmal", " Aurangabad", "Dhule" };
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
		
		StringBuilder reversed = new StringBuilder();
		for (int i = countries.length; i > 0; i--)
		{
			reversed.append(countries[i - 1]).append(" ");
		}
		String[] reversedArray = reversed.toString().split(" ");
		System.out.println(Arrays.toString(reversedArray));
	}
}