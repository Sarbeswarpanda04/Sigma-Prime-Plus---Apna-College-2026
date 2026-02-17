public class palindromeornot {


    public static Boolean ispalindrome(int a) {
        
        int original = a;
        int rev = 0;
        while(original>0){
            int ld = original%10;
            rev = rev*10+ld;
            original = original/10;
        }
        return a == rev;
    }
    
    public static void main(String[] args) {
        System.out.println(ispalindrome(121));
    }
}
