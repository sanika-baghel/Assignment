package assignment4;
import java.util.*;
public class FirstElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(8,5,3,2));
		System.out.println("List: " + list);
		System.out.println("First element of the List: " + list.get(0));

	}
}