package com.misc;

public class SecondHighest {

	public Integer getSecHighest(Integer[] a) {
		Integer highest = Integer.MIN_VALUE;
		Integer secHighest = Integer.MIN_VALUE;

		for (Integer i : a) {
			if (i > highest) {
				secHighest = highest;
				highest = i;
			} else if (i > secHighest) {
				secHighest = i;
			}
		}

		return secHighest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondHighest sh = new SecondHighest();
		Integer[] a= {1,2,3,4,5,6,7};
		System.out.println(sh.getSecHighest(a));

	}

}
