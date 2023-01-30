package assignmentII;

public class LowercaseToUppercase {
	String S = "PROrigo";
	StringBuffer S1 = new StringBuffer(S);for(
	int i = 0;i<S1.length();i++)
	{
		if (Character.isLowerCase(S.charAt(i))) {
			S1.setCharAt(i, Character.toUpperCase(S.charAt(i)));
		}

		else if (Character.isUpperCase(S.charAt(i))) {
			S1.setCharAt(i, Character.toLowerCase(S.charAt(i)));
		}
	}System.out.println("String after case conversion : "+S1);
}}