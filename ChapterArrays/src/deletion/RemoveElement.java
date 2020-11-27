/*
 * Problem: Given an array nums and a value val, remove all instances of that value in-place and return
 * 			the new length. Do not allocate extra space for another array, you must do this by modifying 
 * 			the input array in-place with O(1) extra memory. The order of elements can be changed. 
 * 			It doesn't matter what you leave beyond the new length.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 */

package deletion;

public class RemoveElement {

	public static void main(String[] args) {
		// input
		int[] nums1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		RemoveElement sol = new RemoveElement();

		// method call
		sol.removeElement(nums1, val);
		for (int num : nums1) {
			System.out.print(num + " ");
		}

	}

	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (val == nums[i]) {
				// shift elements
				for (int j = i + 1; j < nums.length; j++) {
					nums[j - 1] = nums[j];
				}
				len--; // reduce the length by one
				i--; // shift the pointer to left after shifting the elements to the left
			}
		}
		return len;
	}

}
