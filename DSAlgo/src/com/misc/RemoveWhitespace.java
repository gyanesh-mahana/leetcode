/*
 * 8. How to remove Whitespaces from String?
 * 
 * 9. How to remove leading and trailing whitespaces from a string?
 */

package com.misc;

public class RemoveWhitespace {

	public String removeWhtSpace(String str) {

		// String are immutable
		char[] chars = str.toCharArray();
		int len = str.length();

		int count = 0;
		for (int i = 0; i < len; i++) {
			if (chars[i] == ' ') {
				count++;
				// primitive way
				// by shifting all the characters leftward
				for (int j = i; j < len - 1; j++) {
					chars[j] = chars[j + 1];
				}
				i++;
			}
		}

		StringBuilder sb = new StringBuilder();

		// building string with removed character(assigning new length)
		for (int i = 0; i < len - count; i++) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}

	public String removeWhtSpaceV2(String str) {
		StringBuilder sb = new StringBuilder(str);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				len--;
				i++;
			}
		}
		return sb.toString();
	}

	public String removeTrailingWhtSpace(String str) {
//		str.stripLeading();
//		str.stripTrailing();
		return str.strip();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveWhitespace rws = new RemoveWhitespace();
		String res = rws.removeWhtSpace("hi how are you?");
		String res2 = rws.removeWhtSpaceV2("hi how are you?");
		System.out.println(res);
		System.out.println(res2);
		
		System.out.println(rws.removeTrailingWhtSpace("    Hey what is up?  "));
	}

}
