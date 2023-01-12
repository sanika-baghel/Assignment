package com.palindrome;
import java.util.*;
public class factorialwithoutrecursion {
	public static void main(String[] args) {
		int f = 1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
        n= sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
        	f=f*i;
        }
        System.out.println("factorial:"+ f);
    }
}
