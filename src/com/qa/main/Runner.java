package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		// new instance of Calculator class
		Calculator divcalc = new Calculator();
		
		// testing if/else statements
		if (25 > 60) {
			System.out.println("This division cannot be performed.");
		} else {
			System.out.println(divcalc.division(25, 60));
		}
		
	}

}
