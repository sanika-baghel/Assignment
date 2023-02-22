//Check if a given number is palindrome or not.
package assignment;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		int no, d, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		int m = no;
		while (no != 0) {
			d = no % 10;
			s = s * 10 + d;
			no = no / 10;
		}
		if (m == s) {
			System.out.print("no is palindrome");

		} else {
			System.out.print("no is not palindrome");
		}
	}
}