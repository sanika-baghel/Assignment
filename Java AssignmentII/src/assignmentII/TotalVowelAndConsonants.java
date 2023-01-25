package assignmentII;

import java.util.*;

public class TotalVowelAndConsonants {
	public static void main(String[] args) {
		String s;
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s = sc.next();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
			{
				a++;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				b++;
			}
		}
		System.out.println("vowels is " + a);
		System.out.println("consonants is " + b);
	}
}