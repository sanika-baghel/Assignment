//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
package assignment;

import java.util.*;

public class DoubleValueCondition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter no1 ");
		double n1 = in.nextDouble();
		System.out.print("enter no2 ");
		double n2 = in.nextDouble();
		System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}