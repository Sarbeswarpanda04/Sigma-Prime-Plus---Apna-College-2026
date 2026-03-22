public class MergeSortLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node mergeSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node mid = getMid(head);
		Node rightHead = mid.next;
		mid.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(rightHead);

		return merge(left, right);
	}

	public static Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static Node merge(Node left, Node right) {
		Node dummy = new Node(-1);
		Node tail = dummy;

		while (left != null && right != null) {
			if (left.data <= right.data) {
				tail.next = left;
				left = left.next;
			} else {
				tail.next = right;
				right = right.next;
			}
			tail = tail.next;
		}

		if (left != null) {
			tail.next = left;
		}

		if (right != null) {
			tail.next = right;
		}

		return dummy.next;
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node head = new Node(7);
		head.next = new Node(3);
		head.next.next = new Node(9);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(6);
		head.next.next.next.next.next = new Node(2);

		System.out.println("Original linked list:");
		printList(head);

		head = mergeSort(head);

		System.out.println("Sorted linked list:");
		printList(head);
	}
}
