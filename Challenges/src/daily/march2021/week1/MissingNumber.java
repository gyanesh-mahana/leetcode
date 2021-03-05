/*
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * Follow up: 
 * Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * 
 */

package daily.march2021.week1;

public class MissingNumber {

	public static int missingNumberOptimized(int[] nums) {
		int n = nums.length;
		int Sn = ((n + 1) * n) / 2;
		int actSn = 0;
		for (int x : nums) {
			actSn = actSn + x;
		}
		return (Sn - actSn);
	}

	public static int missingNumber(int[] nums) {

		int missNum = -1;
		boolean[] missFlag = new boolean[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			missFlag[nums[i]] = true;
		}
		for (int j = 0; j < missFlag.length; j++) {
			if (missFlag[j] == false) {
				missNum = j;
				break;
			}
		}
		return missNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumberOptimized(nums));
	}

}
