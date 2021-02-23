/*
 * 3. Java Program to check if a vowel is present in the string?
 */
package com.misc;

public class CheckVowelInString {

	public boolean isVowelPresent(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char ch : str.toLowerCase().toCharArray()) {
			for (int i = 0; i < vowels.length;i++) {
				if (ch == vowels[i]) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isVowelPresentV2(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckVowelInString cvi = new CheckVowelInString();
		System.out.println(cvi.isVowelPresent("Asdlhfgq"));
		System.out.println(cvi.isVowelPresentV2("Asdlhfgq"));
	}

}
