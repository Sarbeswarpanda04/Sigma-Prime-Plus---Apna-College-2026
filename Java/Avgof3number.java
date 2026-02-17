import java.util.*;
public class Avgof3number {

    public static int Avg(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();
       
        int Avg = (a+b+c)/3;
        return Avg;
    }




    public static void main(String[] args) {
        System.out.println("Average of the above 3 number is : "+Avg());
    }
    
}
