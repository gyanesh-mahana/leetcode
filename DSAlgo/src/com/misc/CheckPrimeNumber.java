/*
 * 4. Java program to check if the given number is Prime?
 */

package com.misc;

public class CheckPrimeNumber {

	public boolean isPrime(int num) {

		if (num == 0 || num == 1) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPrimeV2(int num) {
		if (num == 0 || num == 1)
			return false;
		if (num == 2)
			return true;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPrimeNumber cpn = new CheckPrimeNumber();
		System.out.println(cpn.isPrime(121));
		System.out.println(cpn.isPrimeV2(541));
	}

}
