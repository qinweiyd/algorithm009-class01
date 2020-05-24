/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums != null && nums.length == 1) return nums[0];
        int preSum = nums[0];
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (preSum <= 0) {
                curSum = nums[i];
            }else{
                curSum = preSum + nums[i];   
            }
            if (curSum > maxSum) {
                maxSum = curSum;                
            }
            preSum = curSum;
        }
        return maxSum;
    }
}
// @lc code=end

