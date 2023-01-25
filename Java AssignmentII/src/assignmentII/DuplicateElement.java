package assignmentII;

import java.util.*;

public class DuplicateElement {
	public static void main(String args[]) {
		int[] a = new int[] { 23, 38, 5, 2, 7, 8, 8, 5, 6, 23, 67, 4};
		System.out.println("duplicate elements :");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[j]);
			}
		}
	}
}