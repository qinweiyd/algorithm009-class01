import java.util.*;


/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<List<Integer>>();
       for (int k = 0; k < nums.length -2; k++) {
           if (nums[k] > 0) break;
           if (k > 0 && nums[k] == nums[k -1]) continue;
           int i = k + 1, j = nums.length - 1;
           while (i < j) {
               int sum = nums[k] + nums[i] + nums[j];
               if (sum > 0) while (i < j && nums[j] == nums[--j]);
               if (sum < 0) while (i < j  && nums[i] == nums[++i]);
               if (sum == 0) {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));   
                    while (i < j && nums[j] == nums[--j]);
                    while (i < j  && nums[i] == nums[++i]);
                }
           }
       }
       return res;
    }
}


// @lc code=end

