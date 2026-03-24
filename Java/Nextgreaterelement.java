import java.util.Stack;

public class Nextgreaterelement {
	public static int[] nextGreater(int[] arr) {
		int n = arr.length;
		int[] nge = new int[n];
		Stack<Integer> s = new Stack<>(); // stores indices

		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				nge[i] = -1;
			} else {
				nge[i] = arr[s.peek()];
			}

			s.push(i);
		}

		return nge;
	}

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {6, 8, 0, 1, 3};

		int[] result = nextGreater(arr);

		System.out.print("Array: ");
		printArray(arr);
		System.out.print("Next Greater: ");
		printArray(result);
	}
}
