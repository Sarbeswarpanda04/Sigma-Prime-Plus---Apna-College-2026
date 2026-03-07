public class Printnumberdecreasingorder {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);

    }
}
// 10 9 8 7 6 5 4 3 2 1