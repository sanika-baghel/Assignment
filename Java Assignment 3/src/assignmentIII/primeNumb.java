package assignmentIII;
import java.util.*;
public class primeNumb {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		n = sc.nextInt();
		int s = 0;
		if (n <= 1) {
			System.out.println("The number is not prime");
			return;
		}
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				s++;
			}
		}
		if (s > 1) {
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}
	}
}
