import java.util.*;
public class largestOf2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.print("Enter 1st Number : ");
        a = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        b = sc.nextInt();


        if (a > b) {
            System.out.println( a+" is largest");
        }
        else {
            System.out.println(b+" is largest");
        }
    }
}
