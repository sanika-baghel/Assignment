package com.prorigo.test;

import java.util.*;

public class ReverseLinkedList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println(list);

		LinkedList<Integer> newlist = new LinkedList<>();

		list.descendingIterator().forEachRemaining(newlist::add);

		System.out.println(newlist);
	}
}
