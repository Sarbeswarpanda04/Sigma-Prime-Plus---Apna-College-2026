public class lastoccurancearray {
    public static int lastoccurance(int arr[],int key, int i){
        if(i == arr.length-1){
            return i;
        }

        int isFound = lastoccurance(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 5, 8};
        int i =0;
        int key =8;
        System.out.println(lastoccurance(arr,key,i));
    }
}