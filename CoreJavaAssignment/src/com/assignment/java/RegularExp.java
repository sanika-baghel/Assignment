package com.assignment.java;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExp {
	public static void main(String[] args) {
		String str[] = { "parrot", "ptr ", "pwq" ,"pq" ,"phq" };
		Pattern pattern = Pattern.compile("p.*q");
		for(String str1 : str) {
			Matcher matcher = pattern.matcher(str1);
			if(matcher.matches())
			{
				System.out.println(str1);
			}
		}
	}
}