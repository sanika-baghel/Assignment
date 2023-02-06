package assignmentII;

public class LowercaseToUppercase {
	public static void main(String[] args) {
		String S = "PROrigo";
		StringBuffer p = new StringBuffer(S);
		for (int i = 0; i < p.length(); i++) {
			if (Character.isLowerCase(S.charAt(i))) {
				p.setCharAt(i, Character.toUpperCase(S.charAt(i)));
			}

			else if (Character.isUpperCase(S.charAt(i))) {
				p.setCharAt(i, Character.toLowerCase(S.charAt(i)));
			}
		}
		System.out.println("String : " + p);
	}
}