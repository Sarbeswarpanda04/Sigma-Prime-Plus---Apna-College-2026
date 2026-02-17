/*
a.Math.min( )
b.Math.max( )
c.Math.sqrt( )
d.Math.pow( )
e.Math.avg( )
f.Math.abs( )
 */

import java.util.*;
public class mathfunctions {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter !st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();

        System.out.println("Small number is : "+Math.min(a, b));
        System.out.println("Big number is : "+Math.max(a, b));
        System.out.println("a square root is : "+Math.sqrt(a));
        System.out.println("b square root is : "+Math.sqrt(b));
        System.out.println("a to the power b is : "+Math.pow(a, b));
        

    }
}
