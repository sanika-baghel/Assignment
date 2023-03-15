package com.prorigo.JavaFeature;

/*public class StringSwitchExample {
	public static void main(String[] args) {
		String game = "Cricket";
		switch (game) {
		case "Hockey":
			System.out.println("Let's play Hockey");
			break;
		case "Cricket":
			System.out.println("Let's play Cricket");
			break;
		case "Football":
			System.out.println("Let's play Football");
		}
	}
}*/

public class StringSwitchExample {
	public static void main(String[] args) {
		String game = "Card-Games";
		switch (game) {
		case "Hockey":case "Cricket":case "Football":
			System.out.println("This is a outdoor game");
			break;
		case "Chess":case "Card-Games":case "Puzzles":case "Indoor basketball":
			System.out.println("This is a indoor game");
			break;
		default:
			System.out.println("What game it is?");
		}
	}
}