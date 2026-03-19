public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1  = create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 = newNode next = head
        newNode.next = head;  //link

        //step 3 = head = newNode
        head =  newNode;
    }

    public void addLast(int data){
        //step 1  = create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 = tail.next = newNode
        tail.next = newNode;
        //step 3 = tail = newNode
        tail = newNode;
    }

    public void add(int index, int data){   //add in middle
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode =  new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i< index-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1, temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //===========================//
           //REmove//
    //===========================//

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : 1 = size-2
        Node prev = head;
        for(int i=0; i<size-2;i++){
            prev = prev.next;
        }

        int val =  prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search
    public int search(int key){
        Node temp = head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Search recursively
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0 ;

        }
        int index  = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int searchRecursive(int key){
        return helper(head, key);
   
    }


    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 5);
        ll.print();

        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.search(3));
        System.out.println(ll.searchRecursive(5));


    }
}
