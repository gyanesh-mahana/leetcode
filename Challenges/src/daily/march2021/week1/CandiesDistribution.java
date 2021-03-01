/*
 * Alice has n candies, where the ith candy is of type candyType[i].
 * Alice noticed that she started to gain weight, so she visited a doctor.
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
 * Alice likes her candies very much, and she wants to eat the maximum number of different
 * types of candies while still following the doctor's advice.
 * Given the integer array candyType of length n, return the maximum number of
 * different types of candies she can eat if she only eats n / 2 of them.
 * 
 */

package daily.march2021.week1;

import java.util.HashSet;
import java.util.Set;

public class CandiesDistribution {

	public static int distributeCandies(int[] candyType) {
		int totalCandies = candyType.length;
		int totalUniqueCandyType = 0;
		Set<Integer> uniqueCandyType = new HashSet<Integer>();
		for (Integer candy : candyType) {
			uniqueCandyType.add(candy);
		}

		totalUniqueCandyType = uniqueCandyType.size();
		System.out.println(totalCandies / 2);
		if (totalUniqueCandyType < (totalCandies / 2)) {
			return totalUniqueCandyType;
		}
		return totalCandies / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cadies[] = { 1, 1, 2, 2, 3, 3 };
		System.out.println(distributeCandies(cadies));

	}

}
