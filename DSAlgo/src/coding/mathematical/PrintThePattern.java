/*
 * You a given a number N. You need to print the pattern for the given value of N.
 * for N = 2 the pattern will be
 * 2 2 1 1
 * 2 1
 * for N = 3 the pattern will be
 * 3 3 3 2 2 2 1 1 1
 * 3 3 2 2 1 1
 * 3 2 1
 * 
 */


package coding.mathematical;

public class PrintThePattern {

	public static void printPattern(int n) {

		int temp = n;

		// outer loop until n
		for (int i = 0; i < temp; i++) {
			// inner loop printing value n times
			for (int m = temp; m > 0; m--) {
				for (int j = 0; j < n-i; j++) {
					System.out.print(m);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printPattern(10);

	}

}
