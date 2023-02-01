package assignmentII;

public class MaxMinOccuringChar {
	public static void main(String args[]) {
		String str = "java is an oop language";
		int[] a = new int[str.length()];
		char m = str.charAt(0), n = str.charAt(0);
		int i, j, min, max;
		char string[] = str.toCharArray();
		for (i = 0; i < string.length; i++) {
			a[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					a[i]++;
					string[j] = '0';
				}
			}
		}
		min = max = a[0];
		for (i = 0; i < a.length; i++) {
			if (min > a[i] && a[i] != '0') {
				min = a[i];
				m = string[i];
			}
			if (max < a[i]) {
				max = a[i];
				n = string[i];
			}
		}
		System.out.println("Minimum character: " + m);
		System.out.println("Maximum character: " + n);
	}
}