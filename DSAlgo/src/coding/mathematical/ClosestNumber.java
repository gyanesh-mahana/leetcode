/*
 * Given non-zero two integers N and M. 
 * The problem is to find the number closest to N and divisible by M. 
 * If there are more than one such number, 
 * then output the one having maximum absolute value.
 */

package coding.mathematical;

public class ClosestNumber {

	public static int getClosestNum(int N, int M) {
		int fac = N / M;
		int facp;
		if (fac < 0) {
			facp = fac - 1;
		} else {
			facp = fac + 1;
		}
		if ((N - (M * fac)) == ((M * facp) - N)) {

			if (Math.abs(M * fac) > Math.abs(M * facp)) {
				return M * fac;
			} else {
				return M * facp;
			}
		} else if ((N - (M * fac)) < ((M * facp) - N)) {
			return M * fac;
		} else {
			return M * facp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getClosestNum(-18, 4));

	}

}
