//Bubble sort in java
package assignment;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		int n = 5, i, j, x;
		int[] arr = new int[n];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 5 numbers ");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (i = 0; i < (n - 1); i++) {
			for (j = 0; j < (n - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					x = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = x;
				}
			}
		}
		System.out.println("bubble sorted arr is");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}