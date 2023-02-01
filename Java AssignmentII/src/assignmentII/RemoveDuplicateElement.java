package assignmentII;

public class RemoveDuplicateElement {
	public static int remove(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] a = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				a[j++] = arr[i];
			}
		}
		a[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = a[i];
		}
		return j;
	}
	public static void main(String args[]) {
		int arr[] = { 25, 20, 25, 3, 3, 4, 60, 60 };
		int length = arr.length;
		length = remove(arr, length);
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}