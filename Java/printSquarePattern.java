import java.util.*;
public class printSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sides Of the Square : ");
        int sides = sc.nextInt();
        for(int i = 1;i<=sides;i++){
            for (int j =1;j<=sides;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }

}