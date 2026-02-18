public class Butterfly_Pattern {
    
    public static void Butterfly_Pattern(int n){
        //1st half
        for(int i = 1;i<=n;i++){
            //star =i
            for(int j = 1;j<=i;j++){
                System.err.print("*");  
            }
            //spaces = 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star = i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();   
        }

        //2nd half
        for(int i = n;i>=1;i--){
            //star =i
            for(int j = 1;j<=i;j++){
                System.err.print("*");  
            }
            //spaces = 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star = i
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }  
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Butterfly_Pattern(4);
    }
}
