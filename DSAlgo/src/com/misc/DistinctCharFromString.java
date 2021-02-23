/*
 * 26. How to get distinct characters and their count in a String?
 * 
 */
package com.misc;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharFromString {

	public static Map<Character, Integer> getDistinctChars(String str) {

		char[] res = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char ch:res) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		return charMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistinctChars("wefjhwefekjfbshdj"));
	}

}
