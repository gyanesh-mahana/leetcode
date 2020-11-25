package solutions;

public class DuplicateZeros {

	public static void main(String[] args) {
		//input
		int[] nums = {2,0,3,4,5,0,4,5,4};
				
		DuplicateZeros sol = new DuplicateZeros();
				
		//method call
		sol.duplicateZeros(nums);
		System.out.println("\nWith Loss:");
		for(int e:nums) {
			System.out.print(" "+e);
		}
		
		int[] noLoss = sol.duplicateZerosWithoutLoss(nums);
		System.out.println("\nWithout Loss:");
		for(int e:noLoss) {
			System.out.print(" "+e);
		}

	}
	
	public void duplicateZeros(int[] arr) {
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i]==0) {
    			for(int j=arr.length-1; j>i; j--) {
    				arr[j] = arr[j-1];
    			}
    			arr[i] = 0;
    			i = i+1;
    		}
    	}
    }
	
	public int[] duplicateZerosWithoutLoss(int[] arr) {
		int countZero = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				countZero++;
			}
		}
		int[] result = new int[arr.length+countZero];
		for(int i=0; i<arr.length; i++) {
			result[i]=arr[i];
		}
		
    	for(int i=0; i<result.length; i++) {
    		if(result[i]==0) {
    			for(int j=result.length-1; j>i; j--) {
    				result[j] = result[j-1];
    			}
    			result[i] = 0;
    			i = i+1;
    		}
    	}
    	return result;
    }
}
