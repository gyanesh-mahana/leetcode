/*
 * Given an array of size N-1 such that it can only contain distinct integers 
 * in the range of 1 to N. Find the missing element.
 * 
 * Input: N = 5, A[] = {1,2,3,5}
 * Output: 4
 * 
 * Complete the function MissingNumber() that takes array and N as input and 
 * returns the value of the missing number.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
 */

package practice.arrays;

public class FindMissingNumber {

	public static int missingNumber(int n, int[] arr) {
		int Sn = n * (n + 1) / 2;
		int An = 0;
		if (n != (arr.length + 1)) {
			return -1;
		}
		for (int x : arr) {
			An = An + x;
		}
		return Sn - An;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 2, 3, 5, 6 };
		System.out.println(missingNumber(6, A));
	}

}
