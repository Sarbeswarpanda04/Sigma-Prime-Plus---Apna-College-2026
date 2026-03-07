public class nthfibonaccinumber {
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibn = Fibonacci(n-1)+Fibonacci(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int n = 5000;
        System.out.println(Fibonacci(n));
    }
}
