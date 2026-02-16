import java.util.*;

public class sumfunction {

    public static int calculatesum(int a, int b) {  
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();

        int sum =calculatesum(a,b);
        
        System.out.println(sum);

    }
}
