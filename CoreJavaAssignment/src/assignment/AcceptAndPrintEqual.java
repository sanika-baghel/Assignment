//Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
package assignment;

import java.util.*;

public class AcceptAndPrintEqual {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter no1 ");
		int no1 = in.nextInt();
		System.out.print("enter no2 ");
		int no2 = in.nextInt();
		System.out.print("enter no3");
		int no3 = in.nextInt();
		System.out.print("enter no4");
		int no4 = in.nextInt();

		if (no1 == no2 && no2 == no3 && no3 == no4) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
	}
}