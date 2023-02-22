//Add two numbers without using additional operator
package assignment;

import java.util.Scanner;

public class AddWithoutOperator {
	static int add(int a, int b) {
		for (int i = 1; i <= b; i++)
			a++;
		return a;
	}

	public static void main(String[] args) {
		int no1, no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		no1 = sc.nextInt();
		System.out.println("enter no2");
		no2 = sc.nextInt();
		int a = add(no1, no2);
		System.out.println("Addition is");
		System.out.println(a);
	}
}