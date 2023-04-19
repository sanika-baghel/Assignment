// Write a Java program to compare two priority queues
package com.assignment;

import java.util.*;

public class ComparePriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("java");
		queue1.add("javascript");
		queue1.add("cpp");
		queue1.add("php");
		System.out.println("Priority Queue " + queue1);
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		queue2.add("java");
		queue2.add("python");
		queue2.add("android");
		queue2.add("mysql");
		System.out.println("Priority Queue " + queue2);
		for (String element : queue1) {
			System.out.println(queue2.contains(element) ? "Yes" : "No");
		}
	}
}