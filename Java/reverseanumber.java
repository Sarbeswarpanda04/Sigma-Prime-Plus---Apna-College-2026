import java.util.*;
public class reverseanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        while( num > 0) {
            int lastDigit = num%10;
            System.out.print(lastDigit);
            num = num/10;
        }
        System.out.println();
        }
    }

