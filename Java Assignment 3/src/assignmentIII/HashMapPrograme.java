package assignmentIII;

import java.util.*;

public class HashMapPrograme {
	public static void main(String[] args) {
		HashMap<String, String> States = new HashMap<>();
		HashMap<String, String> states = new HashMap<String, String>();
		states.put("Maharshtra", "Mumbai");
		states.put("Gujarat", "gandhinagar");

		for (Map.Entry m : states.entrySet()) {
			System.out.println("key is " + m.getKey() + " value is " + m.getValue());
		}
	}
}