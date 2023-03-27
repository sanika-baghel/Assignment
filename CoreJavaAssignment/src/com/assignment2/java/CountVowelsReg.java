//Write a Java program to count the number of vowels in a given string using regular expression
package com.assignment2.java;

public class CountVowelsReg {
	public static void main(String[] args) {
		String text = "Sanika";
		System.out.println("Count of vowels are " + VowelsRegExp(text));
	}
	public static int VowelsRegExp(String text) {
		return text.replaceAll("[aeiouAEIOU]", "").length();
	}
}