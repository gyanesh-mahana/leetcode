package inplaceoperation;

import deletion.RemoveDuplicateSortedArray;

public class RemoveDuplicateSortedArrayEnhanced {

	public static void main(String[] args) {
		// input
		int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6 };

		RemoveDuplicateSortedArrayEnhanced sol = new RemoveDuplicateSortedArrayEnhanced();

		// method call
		int count = sol.removeDuplicates(nums);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(" " + nums[i]);
		}

	}

	// Space Complexity: O(1)
	// Time Complexity: O(N)
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		int countUnique = 0;
//        int tempIndex = 0;

// ****************************************************
		//count # of unique elements
//        for(int i=0; i<len; i++){
//            if(i==0 || nums[i]!=nums[i-1]){
//                countUnique++;
//            }    
//        }
// ****************************************************
        //First improvement
//        for(int j=0; j<len; j++){
//            if(j==0 || nums[j]!=nums[j-1]){
//                nums[tempIndex++]=nums[j];	//assigning the unique elements to the original array
//                countUnique++;	//counting the unique elements
//            }
//        }
// ****************************************************

		// Second improvement
		for (int j = 0; j < len; j++) {
			if (j == 0 || nums[j] != nums[j - 1]) {
				// assigning the unique elements to the original array
				// Simultaneously updating the new length with countUnique
				nums[countUnique++] = nums[j];
			}
		}

		return countUnique; // return the new size of array
	}
}
