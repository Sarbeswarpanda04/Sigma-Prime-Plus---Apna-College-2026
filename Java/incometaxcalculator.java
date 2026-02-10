import java.util.*;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float income;
        System.out.print("Enter Your Income : ");
        income = sc.nextFloat();

        if (income<500000){
            System.out.println("Yow will pay 0% tax");
        }
        else if (income>=500000 && income<=1000000){
            System.out.println("Yow will pay 20% tax which is "+(income*0.2));
        }
        else {
            System.out.println("Yow will pay 30% tax which is "+(income*0.3));
        }
    }
}
