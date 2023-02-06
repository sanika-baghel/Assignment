package assignmentII;

public class DuplicateCharacter {
	public static void main(String args[]) {
		String q = "Prorigo";
		int p;
		char s[] = q.toCharArray();
		System.out.println("Duplicate character are :");
		for (int i = 0; i < s.length; i++) {
			p=1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					p++;
					s[j] = 0;
				}
			}
			if ( p > 1 && s[i] != '0')
				System.out.print(s[i]);
		}
	}
}