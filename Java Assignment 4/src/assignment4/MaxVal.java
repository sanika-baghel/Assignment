package assignment4;

import java.util.*;

public class MaxVal {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 160, 1800, 8140, 250);
		Integer max = Collections.max(list);
		System.out.println("Maximum element is: " + max);
	}
}