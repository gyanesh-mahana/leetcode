package com.misc;

public enum EnumsTest {
	ENUM1, ENUM2, ENUM3;

	public static final int START = 0;
	public static final int RUN = 1;
	public static final int WAIT = 2;
	public static final int END = 3;

	public static void main(String[] str) {
		System.out.println(EnumsTest.ENUM1);
		System.out.println(EnumsTest.ENUM2);
		System.out.println(EnumsTest.ENUM3);
		
		System.out.println(EnumsTest.START);
		System.out.println(EnumsTest.RUN);
		System.out.println(EnumsTest.WAIT);
		System.out.println(EnumsTest.END);
		
		
		
	}
}
