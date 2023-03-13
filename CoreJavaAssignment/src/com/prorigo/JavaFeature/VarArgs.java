package com.prorigo.JavaFeature;

public class VarArgs {
	static void display(String... values) {   //three dots specified a variable length 
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String args[]) {

		display(); // zero argument
		display("prorigo"); // one argument
		display("my", "name", "is", "sanika"); // four arguments
	}
}
