/*
 * How Factorial Works Using Recursion:
 *
 * factorial(n) = n * factorial(n-1)
 * factorial(0) = 1  <-- base case (stops recursion)
 *
 * Call Stack for fact(5):
 *
 *   fact(5)
 *     └─ 5 * fact(4)
 *              └─ 4 * fact(3)
 *                       └─ 3 * fact(2)
 *                                └─ 2 * fact(1)
 *                                         └─ 1 * fact(0)
 *                                                  └─ returns 1  [base case]
 *
 * Unwinding (return values bubble back up):
 *   fact(1) = 1 * 1 = 1
 *   fact(2) = 2 * 1 = 2
 *   fact(3) = 3 * 2 = 6
 *   fact(4) = 4 * 6 = 24
 *   fact(5) = 5 * 24 = 120
 */
public class Facorialofn {
    public static int fact(int n ){
        // base case: 0! = 1, stops the recursion
        if(n==0){
            return 1;
        }
        // recursive call: solve a smaller subproblem first
        int factn_minus_1 = fact(n-1);
        System.out.println(n);
        // multiply current n with result of smaller subproblem
        int fact = n * factn_minus_1;
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+n+" is : "+fact(n));
    }
}
