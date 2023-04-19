//Write a Java program to associate the specified value with the specified key in a HashMap.
package com.assignment;

import java.util.*;

public class HashMapKey {
	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Java");
		hash_map.put(2, "php");
		hash_map.put(3, "Javascript");
		hash_map.put(4, "cpp");
		hash_map.put(5, "python");
		for (Map.Entry x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}