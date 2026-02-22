public class Rotate_array_ny_k_step {
    public static void RotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        System.out.print("Rotated array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int k = 2; // Number of steps to rotate
        RotateArray(arr, k);
    }
}