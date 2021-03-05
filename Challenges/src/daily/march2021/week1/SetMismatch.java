/*
 * You have a set of integers s, which originally contains all the numbers from 1 to n. 
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another 
 * number in the set, which results in repetition of one number and loss of another number. 
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * 
 */

package daily.march2021.week1;

import java.util.Arrays;

public class SetMismatch {

	public static int[] findErrorNums(int[] nums) {

		int size = nums.length;
		int[] result = new int[2];
		Arrays.sort(nums);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(nums[i]==nums[j]) {
					result[0]=nums[i];
					break;
				}
			}
		}

		int n = 1;
		for (int i = 0; i < size; i++) {
			if (nums[i] == n) {
				n++;
			}
		}

		result[1] = n;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums = { 2, 2 };
		// int[] nums = { 1, 1 };
		// int[] nums = { 1, 2, 3, 3, 5 };
		// int[] nums = { 3, 2, 3, 4, 6, 5 };
		int[] nums = { 1, 5, 3, 2, 2, 7, 6, 4, 8, 9 };
		System.out.println(findErrorNums(nums)[0]);
		System.out.println(findErrorNums(nums)[1]);
	}

}
