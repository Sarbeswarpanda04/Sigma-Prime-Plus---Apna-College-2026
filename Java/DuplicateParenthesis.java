import java.util.Stack;

public class DuplicateParenthesis {
    
    public static boolean isDuplicate(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                int count = 0;
                
                // Pop characters until we find the matching '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                
                // Pop the '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                
                // If count is 0, it means we have '()' with no characters between
                // This indicates duplicate/empty parentheses
                if (count == 0) {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        String test1 = "((a+b))";    // true (duplicate outer parentheses)
        String test2 = "(a+b)";      // false (no duplicates)
        String test3 = "((a+(b)))";  // true (duplicate around b)
        String test4 = "()";         // true (empty parentheses)
        String test5 = "(a)";        // false (valid single pair)
        
        System.out.println("Test 1: " + test1 + " -> " + isDuplicate(test1));
        System.out.println("Test 2: " + test2 + " -> " + isDuplicate(test2));
        System.out.println("Test 3: " + test3 + " -> " + isDuplicate(test3));
        System.out.println("Test 4: " + test4 + " -> " + isDuplicate(test4));
        System.out.println("Test 5: " + test5 + " -> " + isDuplicate(test5));
    }
}
