import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {

        System.out.print("Enter Radius :");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        float pi = 3.14f;

        float Area = pi*radius*radius;

        System.out.println("Area of the circle is :"+ Area);

    }
    
}
