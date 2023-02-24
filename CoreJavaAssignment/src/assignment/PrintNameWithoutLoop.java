//write a program to print your name 50,000 times without using loop
package assignment;

public class PrintNameWithoutLoop {
	
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