
/*
 * 
 * Problem: Given an array nums of integers, return how many of them 
 * 			contain an even number of digits.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 * 
 */

package basics;

public class EvenDigitNumbers {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 34, 35, 456, 435, 453453 };

		EvenDigitNumbers sol = new EvenDigitNumbers();

		// method call
		int count = sol.findNumbers(nums);
		System.out.println(count);

	}

	public int findNumbers(int[] nums) {
		int numCount = 0;
		for (int n = 0; n < nums.length; n++) {
			int digits = 0;
			int temp = nums[n];
			while (temp != 0) {
				digits++;
				temp = temp / 10;
			}
			if (digits % 2 == 0) {
				numCount++;
			}
		}
		return numCount;
	}

}
