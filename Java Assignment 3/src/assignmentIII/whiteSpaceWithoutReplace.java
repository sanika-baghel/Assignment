package assignmentIII;

import java.util.*;

public class whiteSpaceWithoutReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		char[] strArray = s.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String t = stringBuffer.toString();
		System.out.println(t);
	}
}