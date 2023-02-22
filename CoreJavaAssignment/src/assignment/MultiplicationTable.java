//Generate multiplication table
package assignment;

import java.util.*;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int no = sc.nextInt();
		int a;
		for (int i = 1; i <= 10; i++) {
			a = no * i;
			System.out.println(no + " * " + i + " = " + a);
		}
	}
}