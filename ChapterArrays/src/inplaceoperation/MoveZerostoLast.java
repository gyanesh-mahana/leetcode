/*
 * Problem: Given an array nums, write a function to move all 0's to the end of it while maintaining 
 * 			the relative order of the non-zero elements.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 */

package inplaceoperation;

public class MoveZerostoLast {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6 };

		MoveZerostoLast sol = new MoveZerostoLast();

		// method call
		sol.moveZeroes(nums);
		for (int i : nums) {
			System.out.print(" " + i);
		}
	}

	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int index = 0;

		// with space complexity O(N)
//         int[] result = new int[len];

//         for(int i=0; i<len; i++){
//             if(nums[i]!=0){
//                 result[index++]=nums[i];
//             }
//         }
//         for(;index<len;index++){
//             result[index]=0;
//         }

		// with space complexity O(1)
		for (int i = 0; i < len; i++) {
			// move the non-zero elements in the same array from index=0
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
//		for (; index < len; index++) {
//			nums[index] = 0;
//		}

		// fill the last indices with the zeros
		while (index < len) {
			nums[index++] = 0;
		}
	}

}
