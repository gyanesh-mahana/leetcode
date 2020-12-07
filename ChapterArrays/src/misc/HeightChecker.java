/*
 * Problem: Students are asked to stand in non-decreasing order of heights for an annual photo. Return 
 * 			the minimum number of students that must move in order for all students to be standing in 
 * 			non-decreasing order of height. Notice that when a group of students is selected they can 
 * 			reorder in any possible way between themselves and the non selected students remain on their
 * 			seats.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
 * 
 */

package misc;

public class HeightChecker {

	public static void main(String[] args) {
		// input
		int[] nums = { 2, 3, 4, 1, 5, 6, 7 };

		HeightChecker sol = new HeightChecker();

		// method call
		int result = sol.heightChecker(nums);
		System.out.print(result);

	}

	public int heightChecker(int[] heights) {
		int count = 0;
		int len = heights.length;
		int[] temp = new int[len];
		for (int i = 0; i < len; i++) {
			temp[i] = heights[i];
		}

		// sort the heights
		// can try different sorting algorithms
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (heights[i] > heights[j]) {
					// switch positions
					int t = heights[i];
					heights[i] = heights[j];
					heights[j] = t;
				}
			}
		}

		// compare the heights
		for (int i = 0; i < len; i++) {
			if (temp[i] != heights[i]) {
				count++;
			}
		}

		return count;
	}

}
