/*
 * 27. How to prove String is immutable programatically?
 */

package com.misc;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Orange";
		String s2;
		s2 = s1;
		System.out.println("s1=" + s1 + " and s2=" + s2);
		System.out.println(s1 == s2);
		s1 = "Apple";
		System.out.println("s1=" + s1 + " and s2=" + s2);
		System.out.println(s1 == s2);
	}

}
