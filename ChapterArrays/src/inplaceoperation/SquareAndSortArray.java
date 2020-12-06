/*
 * Problem: Given an integer array nums sorted in non-decreasing order, return an array of the squares 
 * 			of each number sorted in non-decreasing order.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3261/
 * 
 */

package inplaceoperation;

import java.util.Arrays;

public class SquareAndSortArray {

	public static void main(String[] args) {
		// input
		int[] nums = { -3, -2, -1, 0, 1, 5, 6, 7 };
		//9 4 1 0 1 25 36 49

		SquareAndSortArray sol = new SquareAndSortArray();

		// method call
		int[] result = sol.sortedSquares(nums);
		for (int i : result) {
			System.out.print(" " + i);
		}

	}

	
	public int[] sortedSquares(int[] A) {
		int len = A.length;
		for (int i = 0; i < len; i++) {
			A[i] = A[i] * A[i];
		}
		//can implement better sorting algorithms ??
		Arrays.sort(A);
		
		return A;
	}
}
