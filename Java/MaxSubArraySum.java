public class MaxSubArraySum {

    public static int MaxSubArraySum(int nums[]){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
       System.err.println( MaxSubArraySum(nums));
    }
}
