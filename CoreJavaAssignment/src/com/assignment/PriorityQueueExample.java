//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue
package com.assignment;

import java.util.*;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Blue");
		queue.add("Green");
		queue.add("voilet");
		queue.add("red");
		queue.add("Orange");
		queue.add("White");
		queue.add("Black");
		System.out.println("Queue: ");
		System.out.println(queue);
	}
}