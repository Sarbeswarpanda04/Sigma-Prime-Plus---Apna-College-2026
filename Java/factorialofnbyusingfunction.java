import java.util.*;
public class factorialofnbyusingfunction {
    
    public static int factorial() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact *i;
        }
      return fact;
    }

    public static void main(String[] args) {
        
       int f = factorial();
       System.out.println("Factorial is "+f);
    }
}
