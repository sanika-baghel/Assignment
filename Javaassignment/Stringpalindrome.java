package com.palindrome;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s = "dad" ;
          String a = " " ;
          int length=s.length();
          for(int i = length-1;i>=0;i--)
        	  a=a+s.charAt(i);
              if(a.equals(s))
              {
            	  System.out.print("string is palindrome");
              }
              else
            	  
              {
            	  System.out.print("string is not palindrome");
              }
	}

}
