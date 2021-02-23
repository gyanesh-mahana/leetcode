package com.misc;

import java.io.IOException;
import java.util.HashSet;

public class OutputProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// problem 1
		System.out.println("Problem 1-------");
		String s1 = "abc";
		String s2 = "abc";
		// + have higher precedence than == operator
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println("s1 == s2 is:" + (s1 == s2));

		// problem 2
		System.out.println("Problem 2-------");

		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		// char automatically type-casted to int value
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

		// problem 3
		System.out.println("Problem 3-------");
		HashSet shortSet = new HashSet();
		for (short /* OR int */ i = 0; i < 100; i++) {
			// The size of the shortSet will be 100.
			// Java Autoboxing feature has been introduced in JDK 5,
			// so while adding the short to HashSet<Short> it will automatically convert it
			// to Short object.
			// Now “i-1” will be converted to an int while evaluation and after that it will
			// autoboxed to
			// Integer object but there is no Integer object in the HashSet, so it will not
			// remove anything
			// from the HashSet and finally its size will be 100.
			shortSet.add(i);
			shortSet.remove(i - 1/* OR 1.0 */);
		}
		System.out.println(shortSet.size());

		// problem 5
		System.out.println("Problem 5-------");
		String x = "abc";
		String y = "abc";
		x.concat(y); // create a new string but is not assigned to x, so x is unchanged
		System.out.println(y);

		// problem 6
		System.out.println("Problem 6-------");
		try {
			String str = null;
			String str1 = "abc";
			// logical operator OR(|) evaluate both literals
			// instead we should use short circuit logicaloperators(||, && etc.)
			System.out.println(str1.equals("abc") | str.equals(null));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException ocurred...");
		}

		// problem 8
		System.out.println("Problem 8-------");
		try {
			throw new IOException("Hello");
//		} catch (IOException | Exception e) {//compile time error as Exception has already caught the IOException
		} catch (IOException e) {// alternative
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {// alternative
			System.out.println(e.getMessage());
		}

		// problem 4
		System.out.println("Problem 4-------");
		// finally never get executed for any boolean value of flag
		boolean flag = false;

		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}

	}

}
