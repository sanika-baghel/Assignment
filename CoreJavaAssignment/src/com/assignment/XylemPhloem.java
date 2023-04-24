//Xylem and Phloem Number Java Program
package com.assignment;

import java.util.*;
import java.io.*;

public class XylemPhloem {

	public static void main(String args[]) {
		int num, extremesum = 0, meansum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		num = Math.abs(num);
		n = num;
		while (n != 0) {
			if (n == num || n < 10) {
				extremesum = extremesum + n % 10;
			} else {
				meansum = meansum + n % 10;
			}
			n = n / 10;
		}
		System.out.println("The sum of extreme digits: " + extremesum);
		System.out.println("The sum of mean digits: " + meansum);
		if (extremesum == meansum) {
			System.out.println(num + " is a xylem number.");
		} else {
			System.out.println(num + " is a phloem number.");
		}
	}
}