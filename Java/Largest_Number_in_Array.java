public class Largest_Number_in_Array {
    public static int GetLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
               largest = num[i];
            }
            if(num[i]<smallest){
               smallest = num[i];
            }
          
        }
        System.out.println("Smallest Value is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {10,20,30,25,80,120};
        System.out.println("Largest Value is : "+GetLargest(num));
        
    }
}
