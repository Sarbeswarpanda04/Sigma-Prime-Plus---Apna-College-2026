import java.util.EmptyStackException;

public class stackusingll {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class StackLL {
		private Node head;

		public boolean isEmpty() {
			return head == null;
		}

        //push
		public void push(int data) {
            			Node newNode = new Node(data);

            if (isEmpty()) {
				head = newNode;
                return;
			}
			newNode.next = head;
			head = newNode;
		}

        //pop
		public int pop() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			int top = head.data;
			head = head.next;
			return top;
		}

        //peek
		public int peek() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		StackLL s = new StackLL();
		s.push(10);
		s.push(20);
		s.push(30);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
