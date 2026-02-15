import java.util.*;
public class rectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Triangle : ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth of Triangle : ");
        int b = sc.nextInt();

        for (int i = 1; i<=b;i++){
            for (int j = 1;j<=l;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
