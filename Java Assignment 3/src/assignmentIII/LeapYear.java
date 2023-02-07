package assignmentIII;
import java.util.*;
public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year:");
		int n = sc.nextInt();
		boolean flag = false;
		if (n % 400 == 0 || n % 4 == 0) {
			flag = true;
		} else if (n % 100 == 0) {
			flag = false;
		} else {
			flag = false;
		}
		if (flag==true) {
			System.out.println(n + " is Leap Year");
		} else {
			System.out.println(n + " is not Leap Year");
		}
	}
}