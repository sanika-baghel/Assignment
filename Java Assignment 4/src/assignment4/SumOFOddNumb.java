package assignment4;

import java.util.stream.Collectors;

import java.util.*;

public class SumOFOddNumb {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> OddList = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(OddList);
		Integer sum = OddList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}