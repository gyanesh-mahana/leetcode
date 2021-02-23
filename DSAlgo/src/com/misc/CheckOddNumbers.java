/*
 * 6. Check if a List of integers contains only odd numbers?
 */

package com.misc;

import java.util.ArrayList;
import java.util.List;

public class CheckOddNumbers {

	public boolean checkIfOnlyOdd(List<Integer> list) {
		for (Integer i : list) {
			if (i % 2 == 0) {
				return false;
			}
		}

		return true;
	}

	// using ParallelStreamfor faster execution
	// in case the list is very long
	public boolean checkIfOnlyOddV2(List<Integer> list) {

		return list.parallelStream().anyMatch(x -> x % 2 != 0);
	}

	public static void main(String[] str) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 1000000; i = i + 2) {
			list.add(i);
		}
		CheckOddNumbers con = new CheckOddNumbers();
		System.out.println(con.checkIfOnlyOdd(list));
		System.out.println(con.checkIfOnlyOddV2(list));

	}
}
