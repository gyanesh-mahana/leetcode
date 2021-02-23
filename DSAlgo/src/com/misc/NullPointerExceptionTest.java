package com.misc;

public class NullPointerExceptionTest {

	public static void printString(String str) {
		try {
		System.out.print(str.toUpperCase());
		}
		catch(NullPointerException|IllegalArgumentException e) {
			System.out.println("Wrong Argument Passed:");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printString(null);
	}

}
