public class SubString {
    public static String substring(String str, int si, int ei){
        String result = "";
        for(int i = si; i < ei; i++){
            result += str.charAt(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
    }
}
