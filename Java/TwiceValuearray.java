/*Given an integer array nums, return true if any value
 appears at least twice in the array, and return false 
 if every element is distinct. */
public class TwiceValuearray {
    public static boolean  TwiceValuearray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = arr[i];
            for(int j=i+1;j<arr.length;j++){
                int end = arr[j];
                if(start==end){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(TwiceValuearray(arr));
    }
}
