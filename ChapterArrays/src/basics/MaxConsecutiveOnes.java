
/*
 * 
 * Problem: Given a binary array, find the maximum number of consecutive
 * 			1s in this array.
 * 
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * 
 */

package basics;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 1, 0, 1, 1, 1, 0 };

		MaxConsecutiveOnes sol = new MaxConsecutiveOnes();

		// method call
		int count = sol.findMaxConsecutiveOnes(nums);
		System.out.println(count);

	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int maxCount = 0;
		int tempCount = 0;
		for (int n = 0; n < nums.length; n++) {
			if (nums[n] == 1) {
				tempCount++;
			}
			if ((nums[n] == 0) || (n == nums.length - 1)) {
				if (tempCount > maxCount) {
					maxCount = tempCount;
				}
				tempCount = 0;
			}
		}
		return maxCount;
	}

}
