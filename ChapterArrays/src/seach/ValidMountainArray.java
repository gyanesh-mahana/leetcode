/*
 * Problem: Given an array of integers arr, return true if and only if it is a valid mountain array.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 * 
 */

package seach;

public class ValidMountainArray {

	public static void main(String[] args) {
		// input
		int[] nums = { 2, 3, 12, 5, 3 };

		ValidMountainArray sol = new ValidMountainArray();

		// method call
		boolean isExist = sol.validMountainArrayApproach2(nums);

		if (isExist) {
			System.out.println("Valid Mountain Array");
		} else {
			System.out.println("Not Valid Mountain Array");
		}

	}

	public boolean validMountainArray(int[] arr) {

		int len = arr.length;
		int i = 0;
		boolean up = false;
		boolean down = false;

		// Mountain array is possible only if size>=3
		if (len < 3) {
			return false;
		}

		// check the inclining slope of mountain
		while (i < len - 2 && arr[i] < arr[i + 1]) {
			i++;
			up = true;
		}

		// check the declining slope of the mountain
		while (i < len - 1 && arr[i] > arr[i + 1]) {
			i++;
			down = true;
		}

		return (i == len - 1 && up && down);
	}

	public boolean validMountainArrayApproach1(int[] arr) {

		int len = arr.length;
		int peakIndex = 0;
		int peakVal = arr[0];

		// search the index of the peak of mountain
		for (int i = 1; i < len; i++) {
			if (arr[i] > peakVal) {
				peakIndex = i;
				peakVal = arr[i];
			}
		}

		// In a mountain peak cant be on boundaries
		if (peakIndex == 0 || peakIndex == len - 1) {
			return false;
		}

		// incline to peak from index 0
		for (int j = 0; j < peakIndex; j++) {
			if (arr[j] >= arr[j + 1]) {
				return false;
			}
		}

		// decline from peak to index len-1
		for (int j = peakIndex; j < len - 1; j++) {
			if (arr[j] <= arr[j + 1]) {
				return false;
			}
		}
		return true;
	}

	public boolean validMountainArrayApproach2(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		// no maountain with a single element
		if (i == j) {
			return false;
		}

		// ascend the mountain
		while (i + 1 < j && arr[i] < arr[i + 1]) {
			// check the boundary condition
			if (i == j) {
				return false;
			}
			i++; // value reaches peak
		}

		// descend the mountain
		while (j > 0 && arr[j] < arr[j - 1]) {
			// check the boundary condition
			if (j == 1) {
				return false;
			}
			j--; // value reaches the peak
		}

		// if we reach the same peak while ascending and descending the mountain
		// then its the valid mountain
		return i == j;
	}

}
