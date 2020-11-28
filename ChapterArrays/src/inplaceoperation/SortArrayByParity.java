/*
 * Problem: Given an array A of non-negative integers, return an array consisting of all the even elements
 * 			of A, followed by all the odd elements of A. You may return any answer array that satisfies 
 * 			this condition.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 */

package inplaceoperation;

public class SortArrayByParity {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 2, 3, 4, 0, 5, 6, 7 };

		SortArrayByParity sol = new SortArrayByParity();

		// method call
		int[] result = sol.sortArrayByParity(nums);
		for (int i : result) {
			System.out.print(" " + i);
		}
	}

	public int[] sortArrayByParity(int[] A) {
		int len = A.length;
		int evenIndex = 0;
		int oddIndex = len - 1;

		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			if (A[i] % 2 == 0) {
				// add even elements from front
				result[evenIndex++] = A[i];
			} else {
				// add odd elements from back
				result[oddIndex--] = A[i];
			}
		}

		return result;
	}
}
