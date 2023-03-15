//Find a string that has a p followed by anything, ending with q by using a Regular expression from the given list.
package com.assignment.java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindString {

	public static void main(String[] args) {
	    Matcher matcher = matcher(validate("parrot"));
	    boolean matchFound = matcher.find();
	}

	public static String validate(String text) {
		if (text.matches("")) {
		      System.out.println("Match found");
		}
		else {
		      System.out.println("Match not found");

		}
	}
}