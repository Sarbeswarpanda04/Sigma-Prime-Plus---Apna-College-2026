import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num;
        System.out.print("Enter a Number : ");
        num = sc.nextInt();

        if (num%2==0){
            System.out.println(num+" Is a even number");
        }
        else{
            System.out.println(num+" Is a odd number"); 
        }
    }
}
