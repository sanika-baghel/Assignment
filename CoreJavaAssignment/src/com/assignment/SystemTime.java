//Write a Java program to display the system time.
package com.assignment;

public class SystemTime {

	public static void main(String[] args) {
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
	}
}