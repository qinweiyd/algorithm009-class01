import java.util.LinkedList;

/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start
class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }   
            queue.addLast(i);
            if (i - k  >= queue.peek()) {
                queue.poll();
            }
            if (i - k + 1 >= 0) {
                res[i + 1 - k] = nums[queue.peek()];
            }
        }
        return res;
    }
}
// @lc code=end

