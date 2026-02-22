import java.util.Scanner;

public class Count_greaterthan_given_number_array {
    public static void Count_greaterthan_given_number_array(int arr[], int n) {
        int given = 20;
        int count = 0;
        int g[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > given) {
                g[i] = arr[i];
                count++;
            }
        }
        System.out.println("Value greater than " + given + " are " + count + " in number which are : ");
        for (int i = 0; i < arr.length; i++) {
            if (g[i] != 0) {
                System.out.print(g[i] + " ");
            }
        }
        System.out.println();
    }

    public static void ArrayCreate(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        Count_greaterthan_given_number_array(arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        ArrayCreate(n);
    }
}
