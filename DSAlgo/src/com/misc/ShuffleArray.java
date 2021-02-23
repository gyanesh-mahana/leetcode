package com.misc;

import java.util.Random;

public class ShuffleArray {

	public void doShuffle(int[] arr) {

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = r.nextInt(arr.length - 1);
			swap(i, j, arr);
		}

	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuffleArray sa = new ShuffleArray();
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		sa.doShuffle(arr);

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
