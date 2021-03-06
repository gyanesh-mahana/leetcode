/*
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 * 
 * Input:
 * N = 5
 * arr[] = {1,2,3,-2,5}
 * Output:9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which 
 * is a contiguous subarray.
 * 
 * The task is to complete the function maxSubarraySum() which takes arr and N as input parameters 
 * and returns the sum of subarray with maximum sum.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 */

package practice.arrays;

public class KadaneAlgorithm {

	// Time Complexity=>O(N2)
	// Space Complexity=>O(1)
	public static int maxSubarraySum_(int arr[], int n) {

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			sum = 0;
		}

		return maxSum;
	}

	/*
	 * Kadane’s Algorithm:
	 * 
	 * Initialize: max_so_far = 0 max_ending_here = 0
	 * 
	 * Loop for each element of the array 
	 * 
	 * (a) max_ending_here = max_ending_here + a[i] 
	 * (b) if(max_so_far < max_ending_here) 
	 * 		max_so_far = max_ending_here 
	 * (c) if(max_ending_here < 0) 
	 * 		max_ending_here = 0 
	 * 		return max_so_far
	 */
	public static int maxSubarraySum(int arr[], int n) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//		int arr[] = { -2, -3, -1, -2, -3 };
		int[] arr = { 74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75 };
		System.out.println(maxSubarraySum(arr, arr.length));

	}

}
