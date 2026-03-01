public class PalindromeString {
    
    public static void main(String[] args) {
        
        String str = "racecar";
        boolean isPalindrome = true;

        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(str + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }
}