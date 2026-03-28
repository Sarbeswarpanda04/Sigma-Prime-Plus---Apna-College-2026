public class Queue {
    static class Queuee{
        int arr[];
        int size;
        int rear;
        int front;

        Queuee(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add in 1st
            if(isEmpty()){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];

            // last element delete
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queuee q = new Queuee(5);
        q.add(0);
        q.add(1);
        q.add(2);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
