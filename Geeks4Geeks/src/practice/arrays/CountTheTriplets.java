/*
 * Given an array of distinct integers. 
 * The task is to count all the triplets such that sum of two elements equals the third element.
 * 
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 2
 * Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 * 
 * Your task is to complete the function countTriplet() 
 * which takes the array arr[] and N as inputs and returns the triplet count
 * 
 * Expected Time Complexity: O(N2)
 * Expected Auxiliary Space: O(1)
 * 
 * https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
 */

package practice.arrays;

public class CountTheTriplets {

	public static int countTriplet(int[] arr, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
				for (int x : arr) {
					if (x == sum) {
						res++;
						break;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 3, 2, 7, 9, 14 };
		System.out.println(countTriplet(arr, arr.length));
	}

}
