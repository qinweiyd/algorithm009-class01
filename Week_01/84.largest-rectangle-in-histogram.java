import java.util.Stack;

/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start
class Solution84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stc = new Stack<Integer>();
        stc.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stc.peek() != -1 && heights[i] <= heights[stc.peek()]) {
                maxarea = Math.max(maxarea,heights[stc.pop()] * (i - stc.peek() -1) );
            }
            stc.push(i);
        }
        while (stc.peek() != -1) {
            maxarea = Math.max(maxarea,heights[stc.pop()] * (heights.length - stc.peek() -1) );
        }
        return maxarea;
    }
}
// @lc code=end

