import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter a Year : ");
        year = sc.nextInt();

        String Type = ((year%4==0 && year%100!=0) || year%400==0) ? "Leap Year":"Not a Leap Year";
        System.out.println(Type);
    }
}
