public class Facorialofn {
    public static int fact(int n ){
        if(n==0){
            return 1;
        }
        int factn_minus_1 = fact(n-1);
        int fact = n * factn_minus_1;
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+n+" is : "+fact(n));
    }
}
