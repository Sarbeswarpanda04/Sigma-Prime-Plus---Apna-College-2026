public class sumoffirstnnaturalnumbers {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Sum_n_minus_1 = Sum(n-1);
        int Sum = n + Sum_n_minus_1;
        return Sum;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Sum(n));
    }
}
