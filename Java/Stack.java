import java.util.*;
public class Stack {
    public static class StackA {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        StackA.push(1);
        StackA.push(2);
        StackA.push(3);

        while (!StackA.isEmpty()) {
            System.out.println(StackA.peek());
            StackA.pop();
        }
    }
}
