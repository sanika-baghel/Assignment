package com.prorigo.test;

import java.util.*;

public class MultipleList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("raj");
		al.add("ravi");
		al.add("aditya");
		al.add("vikram");
		al.add("rani");

		System.out.println("original List " + al);
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			String temp = al.get(i);
			char a = temp.charAt(0);
			ArrayList<String> newlist = new ArrayList();
			
			if (!chars.contains(a)) {
				for (int j = 0; j < al.size(); j++) {
					String str = al.get(j);
					char aa = str.charAt(0);
					if (temp.charAt(0) == str.charAt(0)) {
						newlist.add(str);
						chars.add(a);
					}
				}
				System.out.println("divided list : " + newlist);
			}
		}
	}
}