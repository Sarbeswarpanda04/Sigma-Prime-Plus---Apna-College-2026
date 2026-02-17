import java.util.*;
public class Binarytodecimal {
    
    public static void BinToDec(int binNum){
        int pow = 0;
        int decimal = 0;
        int num = binNum;
        
        while(binNum>0){
            int LD = binNum % 10;
            decimal = decimal +(LD * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of "+num+" = "+decimal);

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a binary number : ");
        // double num = sc.nextDouble();
        BinToDec(101);   

    }
}
