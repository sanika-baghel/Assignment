//Write a Java program to check two numbers are Amicable numbers or not.
package assignment;

import java.util.*;

public class AmicableNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number ");
		int no1 = sc.nextInt();
		System.out.print("enter second number ");
		int no2 = sc.nextInt();
		int sumno1 = 0, sumno2 = 0;
		for (int i = 1; i <= no1; i++) {
			if (no1 % i == 0)
				sumno1 =sumno1+ i;
		}
		for (int i = 1; i <= no2; i++) {
			if (no2 % i == 0)
				sumno2 = sumno2+i;
		}
		if (sumno1 == sumno2)
			System.out.println("numbers are amicable.");
		else
			System.out.println("numbers are not amicable.");
	}
}