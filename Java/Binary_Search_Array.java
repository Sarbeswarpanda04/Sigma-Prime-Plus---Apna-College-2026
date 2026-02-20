public class Binary_Search_Array {
    public static int BinarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            //Comparision
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){ //right side
                start = mid+1;
            } else { //left side
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14};
        int Key = 10;
        System.out.println("Key found at : "+BinarySearch(arr,Key));
    }
}
