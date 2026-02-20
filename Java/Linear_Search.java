public class Linear_Search {
    public static int linearsearch(int arr[], int key){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
              return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key = 10;
        int arr[] = {2,4,6,8,10,12,14,16};

        int index = linearsearch(arr, key);
        if(index== -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Key is at index : "+index);
        }
    }
}
