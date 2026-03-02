import java.util.*;
public class vowelOccursinString {
    public static int VowelCount(String Sentence){
        int count =0;
        for(int i=0;i<Sentence.length();i++){
            char ch = Character.toLowerCase(Sentence.charAt(i));
            if(ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o' || ch == 'u'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String Sentence = sc.nextLine();

        System.out.println(VowelCount(Sentence));
    }
}
