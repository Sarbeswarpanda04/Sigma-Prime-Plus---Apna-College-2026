import java.util.*;
public class BinomialCoefficient {

    public static int fact(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact = fact *i;
        }

        return fact;
    }

   public static int BinomialCoefficient(int n,int r) {
    
    int factn = fact(n);
    int factr = fact(r);
    int factnr = fact(n-r);

    int BC =  factn/(factr*factnr);

    return BC;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n : ");
    int n = sc.nextInt();
    System.out.print("Enter value of r : ");
    int r = sc.nextInt();
        int a = BinomialCoefficient(n,r);
        System.out.println(a);
    }
}
