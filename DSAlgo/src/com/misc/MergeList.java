package com.misc;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	public static void doMeregeList(List<Integer> l1, List<Integer> l2) {
		l1.addAll(l2);
	}

	public static List<Integer> doMeregeListV2(List<Integer> l1, List<Integer> l2) {

		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < l1.size(); i++) {
			res.add(l1.get(i));
		}
		for (int i = 0; i < l2.size(); i++) {
			res.add(l2.get(i));
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			l1.add(i);
			l2.add(i + 10);
		}
//		doMeregeList(l1, l2);
//		System.out.println(l1);
		
		List<Integer> l = doMeregeListV2(l1, l2);
		System.out.println(l);
	}

}
