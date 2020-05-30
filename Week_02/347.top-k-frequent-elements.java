import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((v1, v2) -> v1.getValue() - v2.getValue());
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (pq.size() < k) {
                pq.add(e);
            }else if (e.getValue() > pq.peek().getValue()){
                pq.poll();
                pq.add(e);
            }
        }
        int[] res = new int[k];
        int idx = 0;
        for (int i = 0; i < k; i++) {
            res[idx++] = pq.poll().getKey();
        }
        return res;
    }
}
// @lc code=end

