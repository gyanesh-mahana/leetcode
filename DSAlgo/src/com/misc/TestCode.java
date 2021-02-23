package com.misc;

import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestCode {

	public static String removeWhtSpaces(String str) {
		char[] chars = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (chars[i] == ' ') {
				count++;
				for (int j = i; j < str.length() - 1; j++) {
					chars[j] = chars[j + 1];
				}
				i--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() - count; i++) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		System.out.println(pq.peek());
		pq.remove();
		Iterator<Integer> iter = pq.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println(removeWhtSpaces("hi     asjh asj o jads"));
	}

}
