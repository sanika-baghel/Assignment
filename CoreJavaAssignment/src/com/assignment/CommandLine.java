package com.assignment;

import java.util.*;

public class CommandLine {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		float sum = a + b + c + d;
		int e = 3;
		float f = sum / 3;
		System.out.println("ans is " + f);
	}
}