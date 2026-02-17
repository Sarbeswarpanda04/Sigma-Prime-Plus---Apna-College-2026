
/*Write a method named isEven that accepts an int argument.
The method should return true if the argument iseven,
or false otherwise .Also write a program to test your method. */

import java.util.*;
public class evenoddmethod {
    public static Boolean isEven(int a) {
        return a%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
      System.out.println(isEven(a));  
    }
}