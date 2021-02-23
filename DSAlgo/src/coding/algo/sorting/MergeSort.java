/*
 * 15. Merge Sort in Java?
 */

package coding.algo.sorting;

public class MergeSort {

	public int[] mergeSort(int[] a, int low, int high) {
		
		if (low == high) {
			int[] res = new int[1];
			res[0] = a[low];
			return res;
		}
		
		int mid = (low + high) / 2;
		int[] a1 = mergeSort(a, low, mid);
		int[] a2 = mergeSort(a, mid + 1, high);

		int res[] = mergedSortedArray(a1, a2);
		return res;
	}

	private static int[] mergedSortedArray(int[] sa, int[] sb) {
		int[] mergedArr = new int[sa.length + sb.length];
		int i, j, k;
		i = j = k = 0;

		while (i < sa.length && j < sb.length) {
			if (sa[i] > sb[j]) {
				mergedArr[k] = sb[j];
				j++;
				k++;
			} else {
				mergedArr[k] = sa[i];
				i++;
				k++;
			}
		}

		if (sa.length == i) {
			while (j < sb.length) {
				mergedArr[k] = sb[j];
				j++;
				k++;
			}
		}
		if (sb.length == j) {
			while (i < sa.length) {
				mergedArr[k] = sa[i];
				i++;
				k++;
			}
		}

//		System.out.println(mergedArr.length + "inside merger");
		return mergedArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSort ms = new MergeSort();
		int[] a = new int[] { 12, 3, 11, 3, -23, 3348, 988 };
		a = ms.mergeSort(a, 0, a.length - 1);
//		System.out.println(a.length);
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
