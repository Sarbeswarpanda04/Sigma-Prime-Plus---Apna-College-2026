public class xtothepowern {
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = Power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        System.out.println(Power(x,n));
    }
}
