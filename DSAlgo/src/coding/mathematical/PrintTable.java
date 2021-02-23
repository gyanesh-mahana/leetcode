/*
 * Your Task: 
 * You don't need to read input. Your task is to complete the function getTable() which takes an integer N as input parameter and returns a list of integers denoting the multiplication of table of N from 1 to 10. 
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 * Constraints: 
 * 1 <= N <= 10000 
 * 
 */


package coding.mathematical;

import java.util.ArrayList;

public class PrintTable {

	public static ArrayList<Integer> getTable(int n) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			res.add(n*i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getTable(32));
	}

}
