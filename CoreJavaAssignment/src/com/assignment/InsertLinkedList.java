//Write a Java program to insert some elements at the specified position into a linked list.
package com.assignment;

import java.util.*;

public class InsertLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("php");
		list.add("javascript");
		System.out.println("linked list:" + list);
		LinkedList<String> newlist = new LinkedList<String>();
		newlist.add("html");
		newlist.add("css");
		newlist.add("cpp");
		list.addAll(2, newlist);
		System.out.println("LinkedList" + list);
	}
}