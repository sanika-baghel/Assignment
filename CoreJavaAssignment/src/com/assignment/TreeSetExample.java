//Write a Java program to create a new tree set,add some colors (string) and print out the tree set.
package com.assignment;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Purple");
		tree.add("blue");
		tree.add("violet");
		tree.add("Red");
		tree.add("Black");
		System.out.println("Tree set ");
		System.out.println(tree);
	}
}