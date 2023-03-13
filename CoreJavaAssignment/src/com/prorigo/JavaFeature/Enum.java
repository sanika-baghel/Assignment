package com.prorigo.JavaFeature;

public class Enum {
	public enum Season {
		WINTER, SPRING, SUMMER, FALL // defining the enum inside the class
	}

	public static void main(String[] args) {
		for (Season s : Season.values())
			System.out.println(s);
	}
}