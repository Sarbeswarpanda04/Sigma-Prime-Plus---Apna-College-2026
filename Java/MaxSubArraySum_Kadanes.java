public class MaxSubArraySum_Kadanes {
    public static void MaxSubArraySum_Kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("Max Sum is : "+maxSum);

    }
    public static void main(String[] args) {
        int arr[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSubArraySum_Kadanes(arr);
    }
}
