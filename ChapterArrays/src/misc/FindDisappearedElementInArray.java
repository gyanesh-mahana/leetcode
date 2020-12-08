/*
 * Problem: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear 
 * 			twice and others appear once. Find all the elements of [1, n] inclusive that do not appear 
 * 			in this array.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
 * 
 */

package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedElementInArray {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 1, 1 };

		FindDisappearedElementInArray sol = new FindDisappearedElementInArray();

		// method call
		List<Integer> result = sol.findDisappearedNumbersNoExtraSpace(nums);
		System.out.print(result);

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		// with extra space
		int len = nums.length;
		int[] temp = new int[len];

		for (int i = 0; i < len; i++) {
			if (temp[nums[i] - 1] == 0) {
				temp[nums[i] - 1] = nums[i];
			}
		}

		for (int i = 0; i < len; i++) {
			if (temp[i] == 0) {
				result.add(i + 1);
			}
		}

		// without extra space

		return result;
	}

	public List<Integer> findDisappearedNumbersNoExtraSpace(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		// with extra space
		int len = nums.length;
		int i = 0;
		int counter = 1;

		// without extra space
		Arrays.sort(nums);
		// can try without sorting using boolean array
		// to check the presence of an element

		while (i < len && counter <= len) {
			if (nums[i] == counter) {
				// got the item
				counter++;// prepare for next item
				i++;// move to next element in array
			} else if (nums[i] > counter || i == len - 1) {
				// item not found
				result.add(counter);
				counter++;// prepare for next item
				// do not move to next element in array
			} else {
				i++;
			}
		}
		if (counter == len) {
			result.add(counter);
		}

		return result;
	}

}
