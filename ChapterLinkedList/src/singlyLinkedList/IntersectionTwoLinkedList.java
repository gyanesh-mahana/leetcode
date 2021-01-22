/*
 * Problem: Write a program to find the node at which the intersection of two singly
 * 			linked lists begins.
 * 
 * Link: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
 * 
 */

package singlyLinkedList;

public class IntersectionTwoLinkedList {

	/*
	 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA =
	 * 2, skipB = 3
	 */
	MyLinkedList list1;
	MyLinkedList list2;

	public IntersectionTwoLinkedList(int[] listA, int[] listB, int skipA, int skipB, int intersectVal) {

		list1 = new MyLinkedList();
		list2 = new MyLinkedList();

		// create the first list
		for (int i = 0; i < listA.length; i++) {
			list1.addAtTail(listA[i]);
		}

		// create second partial list till the pre-joint
		for (int i = 0; i < skipB; i++) {
			list2.addAtIndex(i, listB[i]);
		}

		// link the partial list to the first list at joint node
		if (list1.get(skipA) == intersectVal) {
			Node temp;
			temp = list1.head;

			for (int i = 0; i < skipA; i++) {
				temp = temp.next;
			}
			list2.tail.next = temp;
			list2.tail = list1.tail;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listA = { 4, 1, 8, 4, 5 };
		int[] listB = { 5, 6, 1, 8, 4, 5 };
		int skipA = 2;
		int skipB = 3;
		int intersectVal = 8;

		IntersectionTwoLinkedList intersectionList = new IntersectionTwoLinkedList(listA, listB, skipA, skipB,
				intersectVal);

		Node intersectNode = getIntersectionNode(intersectionList.list1.head, intersectionList.list2.head);

		System.out.println(intersectNode.val);

	}

	/*
	 * @method: getIntersectionNode
	 * 
	 * @input: two heads of the intersection linked list
	 * 
	 * @output: the intersection node
	 */
	public static Node getIntersectionNode(Node headA, Node headB) {

		Node aNode, bNode, iNode;
		iNode = null;
		aNode = headA;
		bNode = headB;

		while (aNode != null) {
//				System.out.print(" aNode->" + aNode.val+"\n");
			while (bNode != null) {
//					System.out.print(" bNode->" + bNode.val);
				if (aNode == bNode) {
					return aNode;
				}
				bNode = bNode.next;
			}
//				System.out.println();
			aNode = aNode.next;
			bNode = headB;
		}

		return iNode;
	}

}
