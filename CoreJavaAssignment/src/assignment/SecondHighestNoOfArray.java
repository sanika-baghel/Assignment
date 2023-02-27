//write a program of java to print second largest no of array

package assignment;

public class SecondHighestNoOfArray {
	static int arr[] = { 20, 10, 30, 50, 60, 55, 28 ,58 };

	static int Secondlargest() {
		int max = arr[0];
		int max2 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max2 = max;
				max = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		return max2;
	}

	public static void main(String args[]) {
		System.out.println("second Largest no : " + Secondlargest());
	}
}