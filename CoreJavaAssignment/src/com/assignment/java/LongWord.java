package com.assignment.java;

import java.util.*;
import java.io.*;

public class LongWord {

	public static void main(String[] args) throws FileNotFoundException{
		new LongWord().LongestWord();
	}

	public String LongestWord() throws FileNotFoundException {
		String word = "";
		String current;
		Scanner sc = new Scanner(new File("D:\\demo.txt"));

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > word.length()) {
				word = current;
			}
		}
		System.out.println(word);
		return word;
	}
}
