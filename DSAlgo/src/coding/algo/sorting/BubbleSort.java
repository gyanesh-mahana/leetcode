package coding.algo.sorting;

import java.util.Arrays;

import com.misc.SortingAnArray;

public class BubbleSort {

	public void bubbleSort(int[] a) {
		for (int i = a.length; i > 0; i--) {	//setting the boundary
			//shifting the largest number to the right end
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

		SortingAnArray saa = new SortingAnArray();
		saa.bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}

}
