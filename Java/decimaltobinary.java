public class decimaltobinary {

public static void DectoBin(int n) {

    int Bin = 0;
    int pow = 0;

    while(n>0){
        int rem = n%2;
        Bin = Bin + (rem*(int)Math.pow(10,pow));
        pow++;
        n = n/2;
    }
    System.out.println(Bin);
}


    public static void main(String[] args) {
        DectoBin(7);
    }
}
