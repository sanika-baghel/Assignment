//write a program of java to print largest no of array
package assignment;

public class LargestNoArray {
	static int arr[] = { 20, 10, 30, 4, 100 };

	static int largest() {
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++)

			if (arr[i] > max) {
				max = arr[i];
			}
		return max;
	}

	public static void main(String args[]) {
		System.out.println("Largest no : " + largest());
	}
}