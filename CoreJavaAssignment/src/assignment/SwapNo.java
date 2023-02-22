//Write a program to swap two numbers in Java.
package assignment;

import java.util.*;

class SwapNo {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1");
		a = sc.nextInt();
		System.out.println("Enter no2");
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("no1 = " + a + " no2 =  " + b);
		System.out.println();
	}
}