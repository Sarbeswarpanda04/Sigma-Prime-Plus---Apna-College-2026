import java.util.*;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        String Type = ((num%2)==0) ? "even" : "odd";
        System.err.println(Type);
        }
}
