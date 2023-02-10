package assignmentIII;

public class validEmailAddress {
	static boolean isValid(String email) {
		String r = ("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
		return email.matches(r);
	}

	public static void main(String[] args) {
		String email = "sanika@gmail.com";
		System.out.println("The E-mail ID is: " + email);
		System.out.println("E-mail ID valid? " + isValid(email));
	}
}