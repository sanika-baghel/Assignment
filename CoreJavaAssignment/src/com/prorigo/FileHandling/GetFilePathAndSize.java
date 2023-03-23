//Java program to get file size
//and file path
package com.prorigo.FileHandling;

import java.io.File;

public class GetFilePathAndSize {
	public static void main(String args[]) {
		final String fileName = "file1.txt";
		try {
			File objFile = new File(fileName);
			System.out.println("File path : " + objFile.getAbsolutePath());
			System.out.println("File size : " + objFile.length() + " bytes.");
		} catch (Exception Ex) {
			System.out.println("Exception: " + Ex.toString());
		}
	}
}