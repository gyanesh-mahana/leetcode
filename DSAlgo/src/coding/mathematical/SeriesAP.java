/*
 * Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 
 */

package coding.mathematical;

public class SeriesAP {

	public static int getNthTermOfAP(int firstTerm, int secondTerm, int n) {
		return ((n-1) * (secondTerm - firstTerm) + firstTerm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getNthTermOfAP(-5, -10, 5));
	}

}
