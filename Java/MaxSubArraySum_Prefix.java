public class MaxSubArraySum_Prefix {
    
    public static void MaxSubArraySum_Prefix(int nums[]){
        int currsum =0;
        int maxSum = nums[0];
        int prefix[] = new int[nums.length];
        
        prefix[0] = nums[0];
        //Calculate prefix array
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("max sum is : "+maxSum);
    }

    public static void main(String[] args) {
         int nums[] = {1,-2,6,-1,3};
       MaxSubArraySum_Prefix(nums);
    }
}
