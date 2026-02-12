import java.util.*;
public class multipleof10continue {

    public static void main(String args[]) {

        // keep entering number till user enter a multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("you enter a multiple of 10 so it will not print.");
                continue;
            }
            System.out.println(num);

        } while (true);

    }

}
