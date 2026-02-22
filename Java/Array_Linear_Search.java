import java.util.*;
public class Array_Linear_Search {
    public static void ArraySearch(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to search : ");
        int s = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                System.out.println(s+" Found at index "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }    
    }
    public static void ArrayCreate(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter index "+i+" value : ");
            arr[i] = sc.nextInt();
        }
        ArraySearch(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        ArrayCreate(n);
    }
}
