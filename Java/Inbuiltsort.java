import java.util.Arrays;
public class Inbuiltsort {
    
    public static void Inbuiltsort(int arr[]){
        Arrays.sort(arr);
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,6};
        Inbuiltsort(arr);
        PrintArr(arr);
    }
}
