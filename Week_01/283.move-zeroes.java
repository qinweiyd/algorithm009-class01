/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution283 {
    public void moveZeroes(int[] nums) {
      int j = 0;
      for (int i = 0; i < nums.length; ++i) {
          if (nums[i] != 0) {
            nums[j] = nums[i];
            if (i != j) {
                nums[i] = 0;
            }  
            j++;
          }
      }
    }

}
// @lc code=end

