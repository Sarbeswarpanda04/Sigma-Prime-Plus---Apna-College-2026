//Print all binary strings of size N without consecutive ones.   e.g-(010101)
public class BinaryStringsProblem {
    public static void printbinarystring(int n, int lastplace, String str) {
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        if (lastplace == 0) {
            printbinarystring(n - 1, 0, str+"0");
            printbinarystring(n - 1, 1, str+"1");
        } else {
            printbinarystring(n - 1, 0, str+"0");

        }
    }

    public static void main(String[] args) {
        printbinarystring(3, 0, "");
    }
}
