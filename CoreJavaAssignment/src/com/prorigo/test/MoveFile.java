//Program for moving file to specific location and close the file
package com.prorigo.test;

import java.io.*;
import java.nio.file.*;

public class MoveFile {

	public static void main(String[] args) throws IOException {
		Path temp = Files.move(Paths.get("D:\\abc.txt"),
					Paths.get("D:\\folder"));

		if (temp != null) {
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}
}
