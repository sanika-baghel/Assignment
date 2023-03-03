//Write a Java program to divide the two given integers using subtraction operator.
package assignment;

import java.util.*;

public class DivideUsingSubOperator {
	public static float divideSub(int dividend, int divider) {
		if (divider == 0) {
			return 0;
		}
		float result = 0;
		while (dividend > divider) {
			dividend = dividend - divider;
			result++;
		}
		float decimalPart = (float) dividend / (float) divider;
		result = result + decimalPart;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("enter the divider: ");
		int divider = sc.nextInt();
		System.out.println("Result: " + divideSub(dividend, divider));
	}
}