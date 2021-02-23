/*
 * 1. How to reverse a String in Java?
 */

package com.misc;

public class ReverseString {

	public String revStringV1(String str) {

		// loop running from end to start
		// character array
		char[] chars = str.toCharArray();
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
//			System.out.println(chars[i]);
			char c = chars[i];
			chars[i] = chars[len - i - 1];
			chars[len - i - 1] = c;
		}
		//ways to convert char array to string
		//1.new String Object
//		String res = new String(chars);
//		return res;
		//2.using StringBuilder
		StringBuilder sb = new StringBuilder();
		for(char ch: chars) {
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public String revStringV2(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			sb.append(str.charAt(str.length()-i-1));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		String in = new String("Hello");
//		rs.revString(in);
		System.out.println(rs.revStringV2(in));

	}

}
