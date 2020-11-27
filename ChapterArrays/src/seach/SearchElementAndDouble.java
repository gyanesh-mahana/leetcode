/*
 * Problem: Given an array arr of integers, check if there exists two integers N and M 
 * 			such that N is the double of M ( i.e. N = 2 * M). 
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 */

package seach;

import java.util.Hashtable;

public class SearchElementAndDouble {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 3,5,7};

		SearchElementAndDouble sol = new SearchElementAndDouble();

		// method call
		boolean isExist = sol.checkIfExistUsingHashTable(nums);

		isExist = sol.checkIfExist(nums);

		if (isExist) {
			System.out.println("Numbers Exist");
		} else {
			System.out.println("Numbers does not Exist");
		}

	}

	public boolean checkIfExist(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] * 2 == arr[j] && i != j) {
					return true;
				}
			}
		}
		return false;
	}

	// Alternative using hash table
	public boolean checkIfExistUsingHashTable(int[] arr) {

		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			ht.put(arr[i], arr[i]);
			if(ht.get(arr[i]*2)!=null) {
				return true;
			}
			else if(arr[i]%2==0 && ht.get(arr[i]/2)!=null) {
				return true;
			}
//			if(ht.containsKey(arr[i]*2)) {
//				return true;
//			}
//			else if(arr[i]%2==0 && ht.containsKey(arr[i]/2)) {
//				return true;
//			}
		}
		return false;
	}
}
