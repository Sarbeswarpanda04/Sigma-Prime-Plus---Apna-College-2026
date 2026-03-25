import java.util.Stack;

public class MaxAreainHistogram {
    
    public static int maxAreaHistogram(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        
        for (int i = 0; i < heights.length; i++) {
            // Pop from stack and calculate area while current bar is smaller
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        
        // Pop remaining bars and calculate area
        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int width = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;
            int area = h * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] test1 = {2, 1, 5, 6, 2, 3};
        int[] test2 = {2, 4};
        int[] test3 = {1, 1};
        int[] test4 = {0, 9};
        
        System.out.println("Test 1: " + java.util.Arrays.toString(test1) + " -> " + maxAreaHistogram(test1));
        System.out.println("Test 2: " + java.util.Arrays.toString(test2) + " -> " + maxAreaHistogram(test2));
        System.out.println("Test 3: " + java.util.Arrays.toString(test3) + " -> " + maxAreaHistogram(test3));
        System.out.println("Test 4: " + java.util.Arrays.toString(test4) + " -> " + maxAreaHistogram(test4));
    }
}
