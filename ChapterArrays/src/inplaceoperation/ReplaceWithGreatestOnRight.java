/*
 * Problem: Given an array arr, replace every element in that array with the greatest element among 
 * 			the elements to its right, and replace the last element with -1.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
 */

package inplaceoperation;

public class ReplaceWithGreatestOnRight {

	public static void main(String[] args) {
		// input
		int[] nums = { 2, 3, 12, 5, 3 };

		ReplaceWithGreatestOnRight sol = new ReplaceWithGreatestOnRight();

		// method call
		int[] result = sol.replaceElements(nums);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public int[] replaceElements(int[] arr) {

		int len = arr.length;
		int maxVal = arr[len - 1];
		for (int i = 0; i < len - 1; i++) {
			for (int j = len - 1; j > i; j--) {
				if (arr[j] > maxVal) {
					maxVal = arr[j];
				}
			}
			arr[i] = maxVal;
			maxVal = arr[len - 1];

		}
		arr[len - 1] = -1;
		return arr;
	}
}
