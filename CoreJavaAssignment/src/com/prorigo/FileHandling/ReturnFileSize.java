//	Program to get size of given file in Java

package com.prorigo.FileHandling;

import java.io.*;

public class ReturnFileSize {
	public static void main(String[] args) {
		File file = new File("D:/sample.txt");
		long fileSize = file.length();
		System.out.println("File size in bytes : " + fileSize);
		System.out.println("File size in KB : " + (double) fileSize / 1024);
		System.out.println("File size in MB : " + (double) fileSize / (1024 * 1024));
	}
}