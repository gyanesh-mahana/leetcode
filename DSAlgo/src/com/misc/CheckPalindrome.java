package com.misc;

public class CheckPalindrome {

	public boolean isPalindrome(String word) {
		int len = word.length();
		for (int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
			if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindromeV2(String word) {
		int len = word.length();
		for (int i = 0; i < len / 2; i++) {
			if (word.charAt(i) != word.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPalindrome cp = new CheckPalindrome();
		System.out.println(cp.isPalindrome("Malayalam"));
		System.out.println(cp.isPalindromeV2("abcdefedcba"));
	}

}
