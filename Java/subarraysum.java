public class subarraysum {
    public static void subarraysum(int arr[]){
        int ts = 0;
        for(int  i=0;i<arr.length;i++){
            int start = i;
            int sum =0;
            for(int j = i;j<arr.length;j++){
                int end = j;
                sum = sum+arr[j];
                for(int k=start;k<=end;k++){ //print
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                System.out.println("Sub array Sum is : "+sum);
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Sub array : "+ts);
    }
    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    subarraysum(arr);    
    }
}
