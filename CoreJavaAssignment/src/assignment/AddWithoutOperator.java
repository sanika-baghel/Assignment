//Add two numbers without using additional operator
package assignment;

public class AddWithoutOperator {
	static int add(int a, int b) {
		for (int i = 1; i <= b; i++)
			a++;
		return a;
	}

	public static void main(String[] args) {
		int a = add(4, 6);
		System.out.print(a);
	}
}