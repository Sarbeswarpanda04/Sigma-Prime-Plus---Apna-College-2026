import java.util.Stack;
public class reversestack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}

		int top = s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}

    public static void reverseastack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseastack(s);
        pushAtBottom(s, top);

    }

    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

		s.push(100);
		s.push(200);
		s.push(300);
        reverseastack(s);
        printstack(s);

	}
}
