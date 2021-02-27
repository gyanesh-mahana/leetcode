package com.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static boolean isPangram(String str) {

		Set<Character> charSet = new HashSet<Character>();
		String pangram = "qwertyuiopasdfghjklzxcvbnm";
		char[] chars = str.toLowerCase().toCharArray();
		for (Character ch : chars) {
			if (pangram.contains(ch.toString())) {
				charSet.add(ch);
			}
		}
		if (charSet.size() == 26) {
			return true;
		}
		return false;
//		System.out.println(charSet.size());
	}

	public static boolean isPangramV2(String str) {

		String pangram = "qwertyuiopasdfghjklzxcvbnm";
		HashMap<Character, Boolean> panMap = new HashMap<Character, Boolean>();
		char[] panChars = pangram.toCharArray();
		for (Character ch : panChars) {
			panMap.put(ch, false);
		}

		char[] chars = str.toLowerCase().toCharArray();
		for (Character ch : chars) {
			if (panMap.containsKey(ch)) {
				panMap.put(ch, true);
			}
		}
		if (panMap.containsValue(false)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String[] strs = { "Waltz, bad nymph, for quick jigs vex.", "Jived fox nymph grabs quick waltz.",
				"Glib jocks quiz nymph to vex dwarf.", "Sphinx of black quartz, judge my vow.",
				"How vexingly quick daft zebras jump!", "The five boxing wizards jump quickly.",
				"Jackdaws love my big sphinx of quartz.", "Pack my box with five dozen liquor jugs.",
				"The quick brown fox jumps over a lazy dog", "Waltz, bad n6mph, for quick jigs vex.",
				"Jived fox nymph grabs quick waltz.", "Glib jocks quiz nymph to 0ex dwarf.",
				"Sphinx of black quartz, judge my vow.", "How vexingly quick daft jump!",
				"The five boxing wizards jump quickly.", "Jackdaws love my biQQQg sphinx of quartz.",
				"Pack my box with five dozen liquor jugs.", "The quick brown fox 12345 6789 a lazy dog",
				"qwertyuiopasdfghjklzxcvbnm", "Q1W2E3R4T5Q1W2E3R4T5Y6U7I8" };
		for (String str : strs) {
			if (isPangramV2(str)) {// (isPangram(str)) {
				System.out.println(str + " is Pangram.");
			} else {
				System.out.println(str + " is NOT a Pangram.");
			}
		}
	}

}
