package com.palindrome;

public class Print1to100 {
	public static void main(String[] args) {
        int n = 100;
        for(int i = 1;n>i;i++)
        {
        	if(i % 3==0)
        	{
        		System.out.println("Fizz");
        	}
        	else if(i % 5==0)
        	{
        		System.out.println("Buzz");
        	}
        	else if (i % 5==0 && i % 3==0)
        	{
        		System.out.println("fizz buzz");
        	}
        	else
        	{
        		System.out.println(i);
        	}
        }
	}
}
