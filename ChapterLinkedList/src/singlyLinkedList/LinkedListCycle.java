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
		int[] list = { 3, 2, 0, -4, -8, 8, 4, -9, 7 };
		LinkedListCycle cycleList = new LinkedListCycle(list, 5);

		System.out.println(cycleList.hasCycle(cycleList.head));
		System.out.println(cycleList.tail.next);
		Node node = cycleList.detectCycle(cycleList.head);
		System.out.println(node.val);
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

			if (slowPointer == fastPointer) { // point where slow and fast pointer coincide confirming a cycle
				return true;
			}
			slowPointer = slowPointer.next; // slow pointer moves one node at a time

			if (slowPointer == null) { // if no cycles
				return false;
			}
		}
		return false;
	}

	/*
	 * method: detectCycle(head)
	 * 
	 * input: head of the linked list
	 * 
	 * output: detect the node where cycle begins, returns the node
	 */
	public Node detectCycle(Node head) {

		Node cycleStartNode, slowPointer, fastPointer; // implementation of double pointer
		slowPointer = fastPointer = head;
		cycleStartNode = null;

		if (slowPointer == null) { // if no node in linked list
			return null;
		}

		while (slowPointer != null) { // run a loop for cycle list

			if (fastPointer.next == null || fastPointer.next.next == null) { // if no cycle
				return null;
			}
			fastPointer = fastPointer.next.next; // fast pointer moves 2 nodes at a time

			if (slowPointer == fastPointer) { // point where slow and fast pointer coincide confirming a cycle

				// concept: the start node of cycle should be reachable from both head and cycle
				// node and it will be the first match when traversed from head and cycle node

				cycleStartNode = head;

				if (slowPointer == slowPointer.next) { // in case the tail points to itself
					return slowPointer;
				}

				// for each node starting from head we check for the first match in the cycle

				// loop from head
				cycleStartNode = head;
				while (cycleStartNode != slowPointer) {
					// loop for cycle
					do {
						slowPointer = slowPointer.next;
						if (slowPointer == cycleStartNode) { // match found
							return cycleStartNode;
						}
					} while (slowPointer != fastPointer); // loop until cycle complete once

					cycleStartNode = cycleStartNode.next;
				}
				break;
			}

			slowPointer = slowPointer.next; // slow pointer moves one node at a time

			if (slowPointer == null) { // if no cycles
				return null;
			}
		}
		return cycleStartNode;
	}

}
