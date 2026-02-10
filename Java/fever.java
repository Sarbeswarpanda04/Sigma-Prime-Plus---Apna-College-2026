import java.util.*;
public class fever {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double temp;
        System.out.println("Enter Your Body Tempreture In Fahernite");
        temp = sc.nextDouble();

        String Condition = (temp>100) ? "You have a fever":"You have not a fever";
        System.out.println(Condition);
    }
}
