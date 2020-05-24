import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution20 {
    public boolean isValid(String s) {
        if (s == null) return true;
        Stack<Character> stc = new Stack<Character>();
        for (Character c : s.toCharArray()){
            if (c == '(') stc.add(')');
            else if (c == '[') stc.add(']');
            else if (c == '{') stc.add('}');
            else if (stc.isEmpty() || c != stc.pop()) return false;
        }
        return stc.isEmpty();
    }
}
// @lc code=end

