/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int num=1;
        for(int i=1;i<x/2;i++){
           num = i*i;
        }
        if(num<=x){
            return num;
        }
        else {
            return
        }

    }
}
// @lc code=end

