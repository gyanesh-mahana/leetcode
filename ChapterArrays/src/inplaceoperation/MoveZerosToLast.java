/*
 * Problem: Given an array nums, write a function to move all 0's to the end of it while maintaining 
 * 			the relative order of the non-zero elements.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 */

package inplaceoperation;

public class MoveZerosToLast {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 0, 3, 12, 3, 0, 0, 25, 5, 0, 2 };

		MoveZerosToLast sol = new MoveZerosToLast();

		// method call
		sol.moveZeroesBigO1(nums);
		for (int i : nums) {
			System.out.print(" " + i);
		}
	}

	public int[] moveZeroesBigON(int[] nums) {
		int len = nums.length;
		int index = 0;

		// with space complexity O(N)
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			// add non-zero element to result array
			if (nums[i] != 0) {
				result[index++] = nums[i];
			}
		}

		// fill the rest positions with zeros
		for (; index < len; index++) {
			result[index] = 0;
		}
		return result;
	}

	public void moveZeroesBigO1(int[] nums) {
		int len = nums.length;
		int index = 0;

		// with space complexity O(1)
		for (int i = 0; i < len; i++) {
			// move the non-zero elements in the same array from index=0
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		// fill the last indices with the zeros
		while (index < len) {
			nums[index++] = 0;
		}
	}

}
