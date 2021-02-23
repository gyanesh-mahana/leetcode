/*
 * 17. Check if two arrays contains same elements?
 */

package com.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfSameElements {

	public boolean ifSameElements(Integer[] a, Integer[] b) {
		HashSet<Integer> ha = new HashSet<Integer>();
		HashSet<Integer> hb = new HashSet<Integer>();

		for (Integer i : a) {
			ha.add(i);
		}
		for (Integer i : b) {
			hb.add(i);
		}

		return ha.equals(hb);

	}

	public boolean ifSameElementsV2(Object[] a, Object[] b) {

		Set<Object> ha = new HashSet<Object>(Arrays.asList(a));
		Set<Object> hb = new HashSet<Object>(Arrays.asList(b));

		if (ha.size() != hb.size()) {
			return false;
		}
		for (Object obj : ha) {
			if (!hb.contains(obj)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 1, 2, 3, 2, 1, 3 };
		Integer[] b = { 1, 2, 3 };
		Integer[] c = { 1, 3, 2, 4 };

		CheckIfSameElements cise = new CheckIfSameElements();
		System.out.println(cise.ifSameElements(b, c));
		System.out.println(cise.ifSameElementsV2(a, c));
		System.out.println(cise.ifSameElements(b, a));
		System.out.println(cise.ifSameElementsV2(a, b));
	}

}
