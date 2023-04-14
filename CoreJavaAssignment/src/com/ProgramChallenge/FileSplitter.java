package com.ProgramChallenge;

import java.io.*;

public class FileSplitter {

	public static void main(String[] args) {

		String inputFilePath = "D:\\github\\Assignment\\CoreJavaAssignment\\cert_chain.pem";
		String outputFilePath1 = "D:\\github\\Assignment\\CoreJavaAssignment\\cert.pem";
		String outputFilePath2 = "D:\\github\\Assignment\\CoreJavaAssignment\\chain.pem";
		int splitSize = 1024; 
		File inputFile = new File(inputFilePath);

		if (!inputFile.exists() || !inputFile.isFile()) {
			System.out.println("Invalid input file path.");
			return;
		}

		String inputFileName = inputFile.getName();
		String inputFileExtension = inputFileName.substring(inputFileName.lastIndexOf(".") + 1);
		if (!"pem".equalsIgnoreCase(inputFileExtension)) {
			System.out.println("Invalid input file type. Only PEM files are supported.");
			return;
		}
		try {
			FileInputStream inputStream = new FileInputStream(inputFilePath);
			FileOutputStream outputStream1 = new FileOutputStream(outputFilePath1);
			FileOutputStream outputStream2 = new FileOutputStream(outputFilePath2);

			byte[] buffer = new byte[splitSize];
			int bytesRead;
			int count = 0;

			while ((bytesRead = inputStream.read(buffer)) != -1) {
				if (count % 2 == 0) {
					outputStream1.write(buffer, 0, bytesRead);
				} else {
					outputStream2.write(buffer, 0, bytesRead);
				}
				count++;
			}

			inputStream.close();
			outputStream1.close();
			outputStream2.close();
			System.out.println("File split successfully into two files.");
		} catch (IOException e) {
			System.out.println("An error occurred while splitting the file: " + e.getMessage());
		}
	}
}
