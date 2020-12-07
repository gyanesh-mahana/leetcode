/*
 * Problem: Given a non-empty array of integers, return the third maximum number in this array. 
 * 			If it does not exist, return the maximum number. The time complexity must be in O(n).
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
 * 
 */

package misc;

import java.util.Arrays;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		// input
		int[] nums = { -32, 1, 1 };

		ThirdMaxNumber sol = new ThirdMaxNumber();

		// method call
		int result = sol.thirdMaxBigON(nums);
		System.out.print(result);
	}

	public int thirdMax(int[] nums) {
		int len = nums.length;

		// sort
		Arrays.sort(nums);

		// remove duplicates
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				// shift left
				for (int j = i; j < len - 1; j++) {
					nums[j] = nums[j + 1];
				}
				len--;
				i--;
			}
		}

		// return third max value
		if (len == 1) {
			return nums[0];
		} else if (len == 2) {
			return nums[1];
		} else
			return nums[len - 3];
	}

	public int thirdMaxBigON(int[] nums) {

		int len = nums.length;
		// 3 max values
		int[] max = new int[3];
		int temp = 0;
		boolean boundaryFlag = false;

		if (len == 1) {
			return nums[0];
		} else if (len == 2) {
			// return max value
			// can also use Math.max
			return (nums[0] > nums[1] ? nums[0] : nums[1]);
		}

		// if len is 3 or more
		// initialize max values with lowest possible values
		for (int i = 0; i < len; i++) {
			if (nums[i] <= temp) { // can use max[2] instead of temp
				temp = nums[i];
				boundaryFlag = true; // if 0 or negative
			}
		}

		max[0] = max[1] = max[2] = temp;

		// loop for max value updation
		for (int i = 0; i < len; i++) {
			// check max values
			if (nums[i] > max[0]) {
				// shift the value before updation
				max[2] = max[1];
				max[1] = max[0];
				// update max1 value
				max[0] = nums[i];
			} else if (nums[i] != max[0] && nums[i] > max[1]) {
				// shift the value before updation
				max[2] = max[1];
				// update max2 value
				max[1] = nums[i];
			} else if (nums[i] != max[0] && nums[i] != max[1] && nums[i] >= max[2]) {
				// update max3 value
				max[2] = nums[i];
			}
		}
		// in case of discrepancy, return max value
		if (max[2] == temp && boundaryFlag == false || max[1] == max[2]) {
			return max[0];
		}
		return max[2];
	}
}
