public class sum_of_element_array {
    
    public static int sum(int arr[]){
        int sum = 0;
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        System.out.println(sum(arr));
    }
}
