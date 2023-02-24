//Factorial number using recursion
package assignment;

public class FactorialNumberWithRecursion {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String args[]) {
		int i, f = 1;
		int no = 4;
		f = factorial(no);
		System.out.println("factorial is " + f);
	}
}
