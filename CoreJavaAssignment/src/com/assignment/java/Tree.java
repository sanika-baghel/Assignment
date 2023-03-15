package com.assignment.java;

import java.util.*;

public class Tree {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "Red");
		map.put(20, "Green");
		map.put(40, "black");
		map.put(50, "white");
		map.put(60, "pink");

		System.out.println("Orginal TreeMap content " + map);
		System.out.println("entry for 10 key " + map.headMap(10, true));
		System.out.println("entry for 70 Key " + map.headMap(70, true));
		}
	}
