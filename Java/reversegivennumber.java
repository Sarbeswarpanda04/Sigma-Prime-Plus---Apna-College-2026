import java.util.*;
public class reversegivennumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse*10)+lastDigit;
            num = num / 10;
        }
        System.out.println("reverse of "+num+" is "+reverse);
    }
}
