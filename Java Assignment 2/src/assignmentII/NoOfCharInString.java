package assignmentII;

import java.util.*;

public class NoOfCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0, i = 0;
		System.out.print("Enter String ");
		String str = sc.nextLine();
		while (i < str.length()) {
			if (str.charAt(i) != ' ') {
				m++;
			}
			i++;
		}
		System.out.println("Number of Characters  is  " + m);
	}
}