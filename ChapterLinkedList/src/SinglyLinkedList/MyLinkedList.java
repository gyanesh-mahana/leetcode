/*
 * My Linked List Class
 */

package SinglyLinkedList;

public class MyLinkedList {
	private Node head;
	private Node tail;

	public MyLinkedList() {
		this.head = this.tail = null;
	}

	public int get(int index) {

		Node node;
		node = this.head;
		if (node == null) {
			return -1;
		}
		if (index == 0) {
			return this.head.val;
		}

		// loop until index
		// if there are not enough nodes return -1
		for (int i = 0; i < index; i++) {
			node = node.next;
			if (node == null) {
				return -1;
			}
		}
		return node.val;

	}

	public void addAtHead(int item) {

		Node node = new Node(item);
		node.next = this.head;
		this.head = node;

		if (node.next == null) {
			this.tail = node;
		}
	}

	public void addAtTail(int item) {

		Node node = new Node(item);
		if (this.tail == null) {
			this.tail = node;
			this.head = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
	}

	public void addAtIndex(int index, int item) {

		Node node = new Node(item);
		Node temp;
		temp = this.head;
		if (temp == null) {
			return;
		}

		if (index == 0) {
			this.addAtHead(item);
		}

		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
			if (temp == null) {
				return;
			}

		}

		node.next = temp.next;
		temp.next = node;

		if (node.next == null) {
			this.tail = node;
		}
	}

	public void deleteAtIndex(int index) {

		Node node;
		node = this.head;

		if (this.head == null) {
			return;
		}

		if (index == 0) {
			if (this.head == this.tail) {
				this.head = this.tail = null;
			} else {
				this.head = this.head.next;
			}
		}

		for (int i = 0; i < index - 1; i++) {
			node = node.next;
		}
		if (node.next == null) {
			return;
		}
		if (node.next.next == null) {
			this.tail = node;
		}
		node.next = node.next.next;

	}

	public static void main(String[] str) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(10);
		linkedList.addAtTail(20);
		linkedList.addAtTail(30);
		System.out.println(linkedList.get(1));
		linkedList.deleteAtIndex(2);
		System.out.println(linkedList.get(2));
	}
}
