import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<String,List<String>>();
        for (String s : strs) {
            char[] sa = s.toCharArray();
            Arrays.sort(sa);
            String key = String.valueOf(sa);
            if (!m.containsKey(key)) m.put(key, new ArrayList<String>());
            m.get(key).add(s);
        }
        return new ArrayList<List<String>>(m.values());

    }
}
// @lc code=end

