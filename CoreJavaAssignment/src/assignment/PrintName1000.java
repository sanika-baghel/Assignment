//print your name 50,000 times
package assignment;

public class PrintName1000 {
	private static void printName(int n) {
		if (--n > 0) {
			System.out.println("Sanika");
			printName(n);
		}
	}
	public static void main(String args[]) {
		printName(50000);
	}
}
