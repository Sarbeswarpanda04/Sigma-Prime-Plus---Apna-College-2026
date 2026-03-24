import java.util.Stack;
public class Pushatbottomofstack {

	public static void pushAtBottom(Stack<Integer> s, int data) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}

		int top = s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}

    public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(100);
		s.push(200);
		s.push(300);

		pushAtBottom(s, 50);

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
  }
}