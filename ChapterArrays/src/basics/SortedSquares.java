/*
 * Problem: Given an array of integers A sorted in non-decreasing order, 
 * 			return an array of the squares of each number, also in sorted non-decreasing order.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 * 
 */

package basics;

public class SortedSquares {

	public static void main(String[] args) {
		// input
		int[] nums = { -7, -3, 2, 3, 11 };

		SortedSquares sol = new SortedSquares();

		// method call
		int[] sortedSquareArray = sol.sortedSquares(nums);
		for (int n : sortedSquareArray) {
			System.out.println(n);
		}

	}

	public int[] sortedSquares(int[] A) {
		int len = A.length;
		int temp = 0;
		int[] square = new int[len];
		for (int i = 0; i < len; i++) {
			square[i] = A[i] * A[i];
		}
		// sorting logic O(N^2)
		// instead can use method available in java:
		// square.sort(); O(NlogN)
		for (int j = 0; j < len; j++) {
			for (int k = j + 1; k < len; k++) {
				if (square[j] > square[k]) {
					temp = square[j];
					square[j] = square[k];
					square[k] = temp;
				}
			}
		}

		return square;
	}

}
