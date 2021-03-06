/*
 * Given an unsorted array A of size N that contains only non-negative integers, 
 * find a continuous sub-array which adds to a given number S.
 * 
 *  Input:
 *  N = 5, S = 12
 *  A[] = {1,2,3,7,5}
 *  Output: 2 4
 *  Explanation: The sum of elements from 2nd position to 4th position is 12.
 *  
 *  The task is to complete the function subarraySum() which takes arr, N and S as input parameters 
 *  and returns a list containing the starting and ending positions of the first such occurring subarray 
 *  from the left where sum equals to S. The two indexes in the list should be according to 1-based indexing. 
 *  If no such subarray is found, return -1. 
 *  
 *  Expected Time Complexity: O(N)
 *  Expected Auxiliary Space: O(1)
 *  
 *  https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 */

package practice.arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

		// Your code here
		int i = 0;
		int start = 0;
		int sum = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();

		while (i < arr.length) {

			sum = sum + arr[i];
			if (sum == s) {
				result.add(start + 1);
				result.add(i + 1);
				break;
			} else if (sum > s) {
				start = start + 1;
				i = start - 1;
				sum = 0;
			}
			i++;

		}
		if (i == n) {
			result.add(-1);
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int[] arr = { 1, 2, 3, 7, 5 };

		System.out.println(subarraySum(arr, arr.length, 198));
	}

}
