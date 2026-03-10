public class friendpairingproblem {
    public static int pair(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //choice
        //single
        int fnm1 = pair(n-1);

        //pair
        int fnm2 = pair(n-2);
        int pairways = (n-1) * fnm2;

        //totalways
        int totalways =  fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));
    }
}
