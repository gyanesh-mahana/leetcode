/*
 * Problem: Given a sorted array nums, remove the duplicates in-place such that 
 * 			each element appears only once and returns the new length. Do not 
 * 			allocate extra space for another array, you must do this by modifying 
 * 			the input array in-place with O(1) extra memory.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
 * 
 */

package solutions;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6 };

		RemoveDuplicateSortedArray sol = new RemoveDuplicateSortedArray();

		// method call
		int count = sol.removeDuplicates(nums);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(" " + nums[i]);
		}
	}

	public int removeDuplicates(int[] nums) {
		int j = 0;
		int len = nums.length;
		int tempToCompare = 0;
		int countDuplicate = 0;

		for (int i = 0; i < len; i++) {
			tempToCompare = nums[i];
			// check for duplicate elements
			if (len > 1) {
				j = i + 1;
			} else {
				return len;
			}

			// move to the last duplicate
			while (j < len && nums[j] == tempToCompare) {
				j++;
			}

			countDuplicate = j - i - 1;
			// shift to left
			for (int k = i + 1; k < len && j < len; k++) {
				nums[k] = nums[j];
				j++;
			}
			len = len - countDuplicate;
		}
		return len;
	}

}
