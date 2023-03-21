//Write a Java program that prints the numbers from 1 to 50. 
//But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
//For numbers which are multiples of both three and five print "FizzBuzz"
package com.assignment.java;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 50;
		for (int i = 1; n >= i; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Fizz" + i);
			} else if (i % 5 == 0) {
				System.out.println("Buzz" + i);
			} else if (i % 3 == 0) {
				System.out.println("fizz buzz" + i);
			} else {
				System.out.println(i);
			}
		}
	}
}