package com.assignment;

import java.util.Scanner;

public class AreaPentagon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of sides: ");
		int n = sc.nextInt();
		System.out.print("enter side: ");
		double side = sc.nextDouble();
		System.out.println("The area of the pentagon is " + pentagon_area(n, side));
	}

	public static double pentagon_area(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}
}