public class sumofalldigit {

    public static int SumofDigit(int num){
        int sum = 0;
        while(num>0){
            int ld = num%10;
            sum = sum+ld;
            num = num/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(SumofDigit(12345));
    }
}
