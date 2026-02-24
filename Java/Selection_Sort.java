public class Selection_Sort {
    public static void Selection_Sort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        
    }
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4};
        Selection_Sort(arr);
        PrintArr(arr);
    }

}
