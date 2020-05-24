/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution11 {
    public int maxArea(int[] a) {
        int max = 0;
        for (int i = 0, j = a.length -1; i < j;) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j-i+1)*minHeight);
        }
        return max;
    }
}
// @lc code=end

