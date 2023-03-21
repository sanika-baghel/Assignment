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
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key");
		no = sc.nextInt();
		SortedMap<Integer , String> part = new TreeMap<>();
		for (Map.Entry<Integer,String>entry : map.entrySet()) {
			if(entry.getKey()<= no) {
				part.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println("checking entry for"+" "+no+":");
		System.out.println("keys :"+ part);

		}
	}
