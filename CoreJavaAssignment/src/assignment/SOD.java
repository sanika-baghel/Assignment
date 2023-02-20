//Calculate the sum of digits of a given number.
package assignment;

import java.util.*;

public class SOD {
	public static void main(String[] args) {
		int no, d, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextInt();
		while (no != 0) {
			d = no % 10;
			s = s + d;
			no = no / 10;
		}
		System.out.print(s);
	}
}