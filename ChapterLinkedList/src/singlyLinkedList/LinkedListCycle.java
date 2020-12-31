/*
 * Double pointer Concept
 * ****************************
 * Problem: Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 			There is a cycle in a linked list if there is some node in the list that can be reached 
 * 			again by continuously following the next pointer. Internally, pos is used to denote the 
 * 			index of the node that tail's next pointer is connected to. Note that pos is not passed
 *  		as a parameter.
 *  		Return true if there is a cycle in the linked list. Otherwise, return false.
 *  
 * Link: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 * 
 */

package singlyLinkedList;

public class LinkedListCycle extends MyLinkedList {

	public LinkedListCycle(int[] list, int cyclePos) {
		Node temp = null;
		for (int i = 0; i < list.length; i++) {
			this.addAtIndex(i, list[i]);

		}

		if (cyclePos >= 0 && cyclePos < list.length) {
			temp = this.head;
			for (int i = 0; i < cyclePos; i++) {
				temp = temp.next;
			}
			this.tail.next = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1, 2, 3, 4, 5, 6 };
		LinkedListCycle cycleList = new LinkedListCycle(list, 0);
		System.out.println(cycleList.hasCycle(cycleList.head));
		System.out.println(cycleList.tail.next);

	}

	/*
	 * method: hasCycle(head)
	 * 
	 * input: head of the linked list
	 * 
	 * output: whether the linked list is a cycle or not, returns true/false
	 */
	public boolean hasCycle(Node head) {

		Node slowPointer, fastPointer; // implementation of double pointer
		slowPointer = fastPointer = head;

		if (slowPointer == null) { // if no node in linked list
			return false;
		}
		
		while (slowPointer != null) { // run a loop for cycle list

			if (fastPointer.next == null || fastPointer.next.next == null) { // if no cycle
				return false;
			}
			fastPointer = fastPointer.next.next; // fast pointer moves 2 nodes at a time
			
			if (slowPointer.val == fastPointer.val) { // point where slow and fast pointer coincide confirming a cycle
				return true;
			}
			slowPointer = slowPointer.next; // slow pointer moves one node at a time
			
			if (slowPointer == null) { // if no cycles
				return false;
			}
		}
		return false;
	}

}
