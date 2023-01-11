package com.palindrome;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no1,no2,no3;
         no1=0;
         no2=1;
         System.out.print(no1+" "+no2);
         for(int i=1;i<=10-2;i++)
         {
        	 no3=no2+no1;
        	 System.out.print(" "+no3);
        	 no1=no2;
        	 no2=no3;
        	 		
         }
	}

}
