import java.util.*;
public class largestof3number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b, c;
        System.out.print("Enter 1st Number : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        c = sc.nextInt();


        if (a >= b && a >=c) {
                System.out.println( a+" is largest");
        }
        else if (b >= a && b >= c){
            System.out.println(b+" is largest");
        }
        else {
            System.out.println(c+" is largest");
        }
    }
}