//Write a Java program to get the element in a tree set which is less than or equal to the given element.
package assignment;

import java.util.*;

public class TreeSetWithCondition {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		TreeSet<Integer> tset = new TreeSet<Integer>();
		t.add(10);
		t.add(22);
		t.add(36);
		t.add(25);
		t.add(16);
		t.add(70);
		t.add(82);
		t.add(89);
		t.add(14);
		System.out.println("Less than or equal to 50 : " + t.floor(50));
		System.out.println("Less than or equal to 89 : " + t.floor(89));
	}
}