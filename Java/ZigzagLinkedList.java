public class ZigzagLinkedList {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;
	public Node tail;
	public int size;

	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;

		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	public void printList() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void zigzag() {
		if (head == null || head.next == null) {
			return;
		}

		Node slow = head;
		Node fast = head.next;

		// Find middle of the linked list.
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node mid = slow;

		// Reverse second half.
		Node curr = mid.next;
		mid.next = null;
		Node prev = null;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		// Alternate merge first and reversed second half.
		Node left = head;
		Node right = prev;

		while (left != null && right != null) {
			Node nextL = left.next;
			Node nextR = right.next;

			left.next = right;
			right.next = nextL;

			left = nextL;
			right = nextR;
		}

		// Refresh tail after re-linking.
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		tail = temp;
	}

	public static void main(String[] args) {
		ZigzagLinkedList ll = new ZigzagLinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);

		System.out.println("Before zig-zag:");
		ll.printList();

		ll.zigzag();

		System.out.println("After zig-zag:");
		ll.printList();
	}
}
