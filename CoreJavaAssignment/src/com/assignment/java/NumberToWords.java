package com.assignment.java;
import java.util.Scanner;

public class NumberToWords {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			int n1=n,n2=n;
			int b=n1%10,a=n2/10; 
			
			String[] single = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
			String[] two = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
			String[] multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
			if(a == 1)
			{
				System.out.println(two[b+1]);
			}
			else if(b == 0)
				System.out.println(multiple[a]);
			else
				System.out.println(multiple[a]+" "+single[b]);
		}
	}