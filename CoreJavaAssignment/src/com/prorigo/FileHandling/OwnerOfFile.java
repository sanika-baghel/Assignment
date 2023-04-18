//Java program to get the file's owner name
package com.prorigo.FileHandling;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Scanner;

public class OwnerOfFile {
	public static void main(String[] args) throws Exception {
		Scanner KB = new Scanner(System.in);

		System.out.print("Enter the file path : ");
		String A = KB.next();
		Path path = Paths.get(A);

		FileOwnerAttributeView view = Files.getFileAttributeView(path, FileOwnerAttributeView.class);

		UserPrincipal userPrincipal = view.getOwner();

		System.out.println("Owner of the file is :" + userPrincipal.getName());
	}
}
