import java.util.*;
public class Array_user_input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt(); 

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" index : ");
            arr[i] = sc.nextInt();
        }

        //Print the Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
