//Substract two numbers without using Arithmetic operator
package assignment;

import java.util.Scanner;

public class SubWithoutOperator {
	static int sub(int a, int b) {
		for (int i = 1; i <= b; b--) {
			a--;
		}
		for (int i = 0; i > b; b++) {
			a++;
		}
		return a;
	}

	public static void main(String[] args) {
		int no1, no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		no1 = sc.nextInt();
		System.out.println("enter no2");
		no2 = sc.nextInt();
		int ans = sub(no1, no2);
		System.out.println("Addition is");
		System.out.println(ans);
	}
}
