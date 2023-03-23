//Java program to get file size 
// and file path
package com.prorigo.FileHandling;

import java.io.File;

public class DeleteFile {
	public static void main(String args[]) {
		final String fileName = "demo.txt";
		File objFile = new File(fileName);
		if (objFile.exists() == true) {
			if (objFile.delete()) {
				System.out.println(objFile.getName() + " deleted successfully.");
			} else {
				System.out.println("File deletion failed!!!");
			}
		} else {
			System.out.println("File does not exist!!!");
		}
	}
}