/*
 * Consider a sample space S consisting of all perfect squares starting from 
 * 1, 4, 9 and so on. You are given a number N, you have to output the number
 * of integers less than N in the sample space S.
 * 
 */
package coding.puzzle;

public class CountSquares {

	public static int countSquares(int n) {
		return (int)Math.sqrt(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countSquares(37));
	}

}
