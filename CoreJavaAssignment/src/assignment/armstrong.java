//Write a program to find whether a number is an Armstrong number or not.
package assignment;

import java.util.*;

public class armstrong {
	public static void main(String[] args) {
		int no, d, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		int m = no;
		while (no != 0) {
			d = no % 10;
			s = s + d * d * d;
			no = no / 10;
		}
		if (m == s) {
			System.out.print("no is armstrong");

		} else {
			System.out.print("no is not armstrong");
		}
	}
}