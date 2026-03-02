public class StringCompression {
    
    public static void main(String[] args) {
        String str = "abbcccdd";

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for(int i = 0; i < str.length(); i++){
            // If next character is different or we're at the end
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i));
                if(count > 1){
                    compressed.append(count);
                }
                count = 1;
            } else {
                count++;
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Compressed: " + compressed.toString());
    }
}
