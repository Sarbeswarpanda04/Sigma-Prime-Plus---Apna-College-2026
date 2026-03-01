public class CharatString {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Sarbeswar";
        String lastName = "Panda";

        String fullName = firstName+" "+lastName;

        System.out.println(fullName.charAt(0));
        printletters(fullName);
    }  
}