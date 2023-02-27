//Write a Java program to clone a hash set to another hash set.
package assignment;

import java.util.*;

public class HashSetClone {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("java");
		h.add("javascript");
		h.add("html");
		h.add("css");
		h.add("php");
		h.add("cpp");
		System.out.println("Hash Set is " + h);
		HashSet<String> newset = new HashSet<String>();
		newset = (HashSet) h.clone();
		System.out.println("Cloned HashSet is " + newset);
	}
}