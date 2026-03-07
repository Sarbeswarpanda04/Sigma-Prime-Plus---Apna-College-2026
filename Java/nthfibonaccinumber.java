public class nthfibonaccinumber {
    public static int Fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int fibn = Fibonacci(n-1)+Fibonacci(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Fibonacci(n));
    }
}
