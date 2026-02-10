import java.util.*;
public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a Number : ");
        number = sc.nextInt();

        String Type = (number>0) ? "Positive" : "Negative";
        System.out.println(number+" Is a "+Type+" Number");

    }
}
