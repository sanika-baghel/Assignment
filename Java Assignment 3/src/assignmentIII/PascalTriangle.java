package assignmentIII;

import java.util.*;
public class PascalTriangle {
	public static void main(String args[]) {
		int n, a, c = 1, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			for (a = 1; a <= n - i; a++)
				System.out.print(" ");
			for (j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					c = 1;
				else
					c = c * (i - j + 1) / j;
				System.out.print(" " + c);
			}
			System.out.print("\n");
		}
	}
}