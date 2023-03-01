// find the lowest number in given array
package assignment;

public class LowestNumbArray {
	static int arr[] = { 20, 10, 30, 4, 100 };

	static int lowest() {
		int i;
		int min = arr[0];
		for (i = 1; i < arr.length; i++)

			if (arr[i] < min) {
				min = arr[i];
			}
		return min;
	}

	public static void main(String args[]) {
		System.out.println("Lowest no : " + lowest());
	}
}