import java.util.Stack;
public class stackusingjavacollectonframework {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(100);
		s.push(200);
		s.push(300);

		while (!s.isEmpty()) {
			System.out.println("Top: " + s.peek());
			System.out.println("Popped: " + s.pop());
		}
	}
}
