/*
 * Problem: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * 		1. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 		2. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 */

package insertion;

public class MergeSoredArray {

	public static void main(String[] args) {
		// input
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		MergeSoredArray sol = new MergeSoredArray();

		// method call
		sol.merge(nums1, m, nums2, n);
		for (int num : nums1) {
			System.out.print(num + " ");
		}

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// nums2 loop
		for (int i = 0; i < n; i++) {
			// nums1 loop
			for (int j = 0; j < nums1.length; j++) {
				// compare elements
				if (nums2[i] <= nums1[j]) {
					// shift nums1 to right from j position
					for (int k = nums1.length - 1; k > j; k--) {
						nums1[k] = nums1[k - 1];
					}
					// place the element on right place
					nums1[j] = nums2[i];
					break;
				} else if (j == i + m) {
					nums1[j] = nums2[i];
					break;
				}
			}
		}
	}

}
