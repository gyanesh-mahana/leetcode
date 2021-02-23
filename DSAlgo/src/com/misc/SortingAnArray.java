/*
 * 10. Sorting an array in Java?
 * 
 * Java uses many ways to implement sorting of primitive and Objects
 * For normal use like Array.sort:
 * Dual pivoted Quick sort
 * 
 * For Objects:
 * Merge sort
 * 
 * But, if you want to sort an array of Objects, then the object must implement Comparable interface. 
 * If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic. 
 * You should read more about them at – Comparable and Comparator in Java.
 */

package com.misc;

import java.util.Arrays;

public class SortingAnArray {

	public void bubbleSort(int[] a) {
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < a.length - 1; j++) {
				// compare the two neighbor numbers
				if (a[j] > a[j + 1]) {

					// if first > second then swap
					swap(j, j + 1, a);
				}
			}
		}
	}

	private static void swap(int i, int j, int[] arr) {

		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 34, 4, 422, 23, 43, 41, 234, 243, 434, -13, -32 };
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));

		SortingAnArray saa = new SortingAnArray();
		saa.bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}

}
