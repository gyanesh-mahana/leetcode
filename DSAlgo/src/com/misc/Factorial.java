/*
 * 12. Find factorial of an integer?
 */

package com.misc;

import java.math.BigInteger;

public class Factorial {

	public int factorialWithRecursive(int n) {

		if (n <= 1) {
			return 1;
		}
		return n * factorialWithRecursive(n - 1);
	}

	public BigInteger factorialWithRecursive(BigInteger n) {

		if (n.compareTo(BigInteger.ONE)<=0) {
			return BigInteger.ONE;
		}
		return n.multiply(factorialWithRecursive(n.subtract(BigInteger.ONE)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial f = new Factorial();
		BigInteger n = new BigInteger("45");
		System.out.println(f.factorialWithRecursive(n));
		System.out.println(f.factorialWithRecursive(23));
	}

}
