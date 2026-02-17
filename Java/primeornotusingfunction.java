import java.util.Scanner;

public class primeornotusingfunction {
    
    public static boolean prime(int n){
        boolean isPrime=true;
        for(int i = 2;i<n-i;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
    public static void main(String[] args) {
        
        System.out.print(prime(5));
    }
}
