class Solution {
    public int rob(int[] nums) {
         int m = nums.length, dp[] = new int[m];
         if(m == 0) return 0;
         if (m == 1) return nums[0];
         dp[0] = nums[0];
         dp[1] = nums[0];
         for (int i = 2; i < m - 1; i++) {
             dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]); 
         }
         int max = dp[m - 2];
         dp[0] = 0;
         dp[1] = nums[1];
         for (int i = 2; i < m; i++) {
             dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
         }
         return Math.max(max, dp[m - 1]);
    }
}