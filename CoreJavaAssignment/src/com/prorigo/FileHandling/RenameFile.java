//Java program to rename an existing file

package com.prorigo.FileHandling;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	public static void main(String[] args) {
		try {
			File F = new File("d:/demo12.txt");

			File T = new File("d:/sample.txt");

			F.renameTo(T);

			System.out.println("File Rename Successfully...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}