import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Welcome to Calculator ");
        System.out.println("(Supports + - * / %)");
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();

        char operator;
        System.out.print("Enter an Operator : ");
        operator = sc.next().charAt(0);
    

        switch (operator) {
            case '+' : System.out.println(num1+num2);;
                break;
            case '-' : System.out.println(num1-num2);;
                break;
            case '*' : System.out.println(num1*num2);;
                break;
            case '/' : System.out.println(num1/num2);;
                break;
            case '%' : System.out.println(num1%num2);;
                break;
            default  : System.out.println("Invalid Operatror");
                break;
        }

    }
}
