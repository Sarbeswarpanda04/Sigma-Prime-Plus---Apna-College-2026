public class firstoccurancearray {
    public static int Firstoccurance(int arr[],int key, int i){
        if(i == arr.length-1){
            return i;
        }
        if(arr[i]==key){
            return i;
        }

        return Firstoccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 5, 8};
        int i =0;
        int key =8;
        System.out.println(Firstoccurance(arr,key,i));
    }
}
