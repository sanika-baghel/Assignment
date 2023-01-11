package com.palindrome;

public class factorialrecursion {
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i ,f = 1;
          int n = 4;
          f= factorial(n);
          System.out.println("factorial is"+f);
	}

}
