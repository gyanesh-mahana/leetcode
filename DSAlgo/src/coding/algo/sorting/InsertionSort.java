package coding.algo.sorting;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		int len = arr.length;

		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];// shift
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 324, 13, 13, 123, 23, 23, 2, 3, 24, 35, 46, 7, 8, 88 };
		arr = insertionSort(arr);
		for (int i : arr)
			System.out.println(i);

	}

}
