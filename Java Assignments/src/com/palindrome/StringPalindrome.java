package src.com.palindrome;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "dad";
		String a = " ";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--)
			a = a + s.charAt(i);
		if (a.equals(s)) {
			System.out.print("string is palindrome");
		} else {
			System.out.print("string is not palindrome");
		}
	}
}