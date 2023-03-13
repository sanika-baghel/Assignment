//Write a Java program to get the element in a tree set which is less than or equal to the given element.
package assignment;

import java.util.*;

public class TreeSetWithCondition {
	public static void main(String[] args) {
		//TreeSet<Integer> tset = new TreeSet<Integer>();
		//SortedSet<Integer> tset = new TreeSet<Integer>();
		NavigableSet<Integer> tset = new TreeSet<Integer>();
		tset.add(10);
		tset.add(22);
		tset.add(36);
		tset.add(25);
		tset.add(16);
		tset.add(70);
		tset.add(82);
		tset.add(89);
		tset.add(14);
		System.out.println("Less than or equal to 50 : " + tset.headSet(50));
		System.out.println("Less than or equal to 50 : " + tset.floor(50));
	}
}