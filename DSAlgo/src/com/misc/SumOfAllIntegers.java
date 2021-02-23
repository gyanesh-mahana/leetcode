/*
 * 18. Sum of all elements in integer array?
 */

package com.misc;

public class SumOfAllIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 234, 543, 534, 545, 435, 345, 43, 5, 435, 43, 5 };
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println(sum);
	}

}
