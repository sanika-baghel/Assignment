//Write a Java program to check if three given side lengths (integers) can make a triangle or not.
package assignment;

import java.util.*;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter side1: ");
		int s1 = sc.nextInt();
		System.out.print("enter side2: ");
		int s2 = sc.nextInt();
		System.out.print("enter side3: ");
		int s3 = sc.nextInt();

		System.out.print("sides form a triangle: " + isValidTriangle(s1, s2, s3));
	}

	public static boolean isValidTriangle(int a, int b, int c) {
		return (a + b > c && b + c > a && c + a > b);
	}
}