class Solution {
    public int maxProfit(int[] nums) {
        if (nums.length == 1 || nums.length == 0) return 0;
        int min = nums[0], profit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= min) {
                profit = Math.max(nums[i] - min, profit);
            }else {
                min = nums[i];
            }       
        }
        return profit;
    }
}