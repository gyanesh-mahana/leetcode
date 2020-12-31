/*
 * Problem: To design a Linked List with basic operations
 * 
 * Link: https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
 * 
 */

package singlyLinkedList;

public class MyLinkedList {

	// Head and Tail of the Singly Linked List
	private Node head;
	private Node tail;

	// Constructor
	public MyLinkedList() {
		// initially head and tail have null reference
		this.head = this.tail = null;
	}

	/*
	 * method: get(index) input: index output: value at index
	 */
	public int get(int index) {

		Node temp; // temporary node
		temp = this.head;
		if (temp == null) {
			return -1;
		}
		if (index == 0) {
			return this.head.val;
		}

		// loop until index
		// if there are not enough nodes return -1
		for (int i = 0; i < index; i++) {
			temp = temp.next; // traversal of nodes upto index
			if (temp == null) { // if node hit null reference before reaching to the index
				return -1;
			}
		}
		return temp.val;

	}

	/*
	 * method: addAtHead(item) input: item value output: add the item at index 0,
	 * return nothing
	 */
	public void addAtHead(int item) {

		Node node = new Node(item); // new node to add
		node.next = this.head;
		this.head = node; // update the head of the linked list

		if (node.next == null) { // update tail of the linked list
			this.tail = node;
		}
	}

	/*
	 * method: addAtTail(item) input: item value output: add the item at last index,
	 * return nothing
	 */
	public void addAtTail(int item) {

		Node node = new Node(item); // new node to add

		if (this.tail == null) { // if the linked list is empty
			this.tail = node;
			this.head = node;
		} else { // otherwise
			this.tail.next = node;
			this.tail = node;
		}
	}

	/*
	 * method: addAtIndex(index, item) input: index and item value output: add the
	 * item at given index, return nothing
	 */
	public void addAtIndex(int index, int item) {

		Node node = new Node(item); // new node to add
		Node temp; // temporary node reference to traverse
		temp = this.head;

		if (index == 0) { // if index is 0
			this.addAtHead(item);
			return;
		} else if (temp == null) { // if no node in linked list and index is not 0
			return;
		}

		// loop to traverse to the index location
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
			if (temp == null) { // if node refer to a null node before index is found
				return;
			}
		}

		// add node at given index
		node.next = temp.next;
		temp.next = node;

		if (node.next == null) { // update tail
			this.tail = node;
		}
	}

	/*
	 * method: deleteAtIndex(index) input: index output: delete the item at given
	 * index, return nothing
	 */
	public void deleteAtIndex(int index) {

		Node temp; // temporary node reference for traversal
		temp = this.head;

		if (this.head == null) { // if no node in linked list
			return;
		}

		if (index == 0) { // if index is 0
			if (this.head == this.tail) { // no node available
				this.head = this.tail = null;
			} else { // nodes available
				this.head = this.head.next;
			}
		}

		// loop for traversal to index location
		for (int i = 0; i < index - 1; i++) { // running 1 less to capture previous node for updating tail
			temp = temp.next;
			if (temp == null) { // if index is greater than available nodes
				return;
			}
		}

		if (temp.next == null) { // the next node to be deleted is not present
			return;
		}

		if (temp.next.next == null) { // if the node to be deleted is last node
			this.tail = temp; // update tail to previous node
		}

		temp.next = temp.next.next; // delete the node by updating the next reference

	}

	public static void main(String[] str) {
		/*
		 * ["MyLinkedList","addAtIndex","addAtIndex","addAtIndex","get"]
		 * [[],[0,10],[0,20],[1,30],[0]]
		 */

		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtIndex(0, 10);
		System.out.println(linkedList.get(0));
		linkedList.addAtIndex(0, 20);
		System.out.println(linkedList.get(0));
		linkedList.addAtIndex(1, 30);
		System.out.println(linkedList.get(0));
	}
}
