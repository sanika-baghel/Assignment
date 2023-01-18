package src.com.palindrome;

public class FactorialRecursion {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		int f = 1;
		int n = 4;
		f = factorial(n);
		System.out.println("factorial is" + f);
	}
}
