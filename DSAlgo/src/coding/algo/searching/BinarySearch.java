/*
 * 14. How to implement Binary Search?
 */

package coding.algo.searching;

public class BinarySearch {

	// binary search always on sorted array
	public int binarySearch(int[] a, int low, int high, int key) {
		if (low < 0 || high >= a.length) {	//boundary condition check
			return -1;
		}

		int mid = (low + high) / 2;

		while (low <= high) {
			if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
			//updated new mid after every N/2 space complexity
			mid = (low + high) / 2;
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch bs = new BinarySearch();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(bs.binarySearch(a, 0, a.length-1, 9));
	}

}
