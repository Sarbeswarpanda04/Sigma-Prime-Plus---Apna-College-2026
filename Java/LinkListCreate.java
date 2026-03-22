import java.util.LinkedList;
public class LinkListCreate {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		// Add elements
		list.add(10);
		list.add(20);
		list.addFirst(5);
		list.addLast(30);

		System.out.println("Initial list: " + list);

		// Access elements
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());

		// Remove elements
		list.removeFirst();
		list.removeLast();

		System.out.println("After removing first and last: " + list);

		// Iterate through list
		System.out.print("Elements: ");
		for (int num : list) {
			System.out.print(num + " ");
		}
	}
}
