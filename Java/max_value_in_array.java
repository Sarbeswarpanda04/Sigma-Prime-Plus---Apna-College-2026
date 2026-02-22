import java.util.*;
public class max_value_in_array {
    public static void FindMaximum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum is : "+max);
    }

    public static void ArrayCreate(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        FindMaximum(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        ArrayCreate(n);
    }
}
