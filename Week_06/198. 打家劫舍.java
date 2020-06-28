class Solution {
    public int rob(int[] nums) {
        int m = nums.length;
        if (m == 0) return 0;
        if (m == 1) return nums[0];
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < m; i++) {
            int temp = second;
            second = Math.max(second, nums[i] + first);
            first = temp;
        }
        return second;
    }
}