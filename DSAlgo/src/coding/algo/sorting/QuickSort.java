package coding.algo.sorting;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 1, 3, 2 };
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
