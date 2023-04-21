// Java Copy Content of One File to Another File
package com.prorigo.FileHandling;

import java.io.*;

public class CopyFile {
	public static void main(String args[]) throws IOException {
		File fileName = new File("d:/sample.txt");
		FileInputStream inFile = new FileInputStream("d:/sample.txt");
		int fileLength = (int) fileName.length();
		byte Bytes[] = new byte[fileLength];
		System.out.println("File size is: " + inFile.read(Bytes));
		String file1 = new String(Bytes);
		System.out.println("File content is:\n" + file1);
		FileOutputStream outFile = new FileOutputStream("d:/sample-copy.txt");
		for (int i = 0; i < fileLength; i++) {
			outFile.write(Bytes[i]);
		}
		System.out.println("File copied.");
		inFile.close();
		outFile.close();
	}
}