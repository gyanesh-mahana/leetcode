/*
 * 13. Reverse a Linked List?
 */

package com.misc;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll);
		LinkedList<Integer> llr = new LinkedList<Integer>();
		ll.descendingIterator().forEachRemaining(llr::add);
		System.out.println(llr);
		
	}

}
