//linear search in java program
package assignment;

public class LinearSearch {
	public static int linearSearch(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1 ;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 4, 0, 1, 9 };
		int x = 9;

		int value = linearSearch(arr, x);

		if (value == -1)
			System.out.print("numb is not there");
		else
			System.out.print("numb is : " + value);
	}
}