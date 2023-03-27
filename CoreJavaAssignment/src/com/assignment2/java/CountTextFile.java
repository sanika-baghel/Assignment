//7. Java Program to Count the Number of Lines, Words, Characters, and Paragraphs in a Text File
package com.assignment2.java;

import java.io.*;

public class CountTextFile {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\github\\Assignment\\CoreJavaAssignment\\demo1.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int word = 0;
		int character = 0;
		int para = 0;
		int whiteSpace = 0;
		int sentenceCount = 0;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				para += 1;
			} else {
				character += line.length();
				String words[] = line.split("\\s+");
				word = word + words.length;
				whiteSpace += word - 1;
				String sentence[] = line.split("[!?.:]+");
				sentenceCount += sentence.length;
			}
		}
		if (sentenceCount >= 1) {
			para++;
		}
		System.out.println("Total word = " + word);
		System.out.println("Total sentences = " + sentenceCount);
		System.out.println("Total characters = " + character);
		System.out.println("Number paragraphs = " + para);
		System.out.println("Total whitespaces = " + whiteSpace);
	}
}