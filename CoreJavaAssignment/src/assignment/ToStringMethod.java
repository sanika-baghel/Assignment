//Java Program to Show Usage of toString() Method
package assignment;

public class ToStringMethod {
	int rollno;
	String name;
	String city;

	ToStringMethod(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return rollno + " " + name + " " + city;
	}

	public static void main(String args[]) {
		ToStringMethod s1 = new ToStringMethod(101, "sanika", "Nagpur");
		ToStringMethod s2 = new ToStringMethod(102, "monica", "pune");

		System.out.println(s1);
		System.out.println(s2);
	}
}