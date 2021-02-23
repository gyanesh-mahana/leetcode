/*
 * Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.
 */

package coding.mathematical;

public class SeriesGP {

	public static int getNthTermOfGP(Integer A, Integer R, Integer N) {
		return (int) (A * Math.pow(R, N - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNthTermOfGP(5, 9, 10));
	}

}
