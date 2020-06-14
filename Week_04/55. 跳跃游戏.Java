class Solution {
    public boolean canJump(int[] nums) {
      int reach = 0, n = nums.length;
      for (int i = 0; i <= reach && reach <= n - 1; ++i) 
        reach = Math.max(reach, i + nums[i]);
      return reach >= n - 1;
    }
}