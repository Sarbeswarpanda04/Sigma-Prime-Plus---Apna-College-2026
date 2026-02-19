public class Palindrome_Number {
    //Test Case 1
    // public static boolean isPalindrome(int x){
    //     String s = Integer.toString(x);
    //     int len = s.length();
    //     for(int i = 0;i<len/2;i++){
    //       if(s.charAt(i)!=s.charAt(len-1-i))
    //         return false;
    //     }
    //     return true;
    // }
    
    //Test Case 2
    public static boolean isPalindrome(int x){
        int current = x;
        int rev=0;
        while(current>0){
           int ld = current%10;
           rev = rev*10+ld;
           current = current/10;
        }
            return x==rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
