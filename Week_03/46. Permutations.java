import java.util.ArrayList;
import java.util.List;

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length == 0) return res;
        processArray(res, nums, 0, new ArrayList<Integer>());
        return res;
    }

    public void processArray(List<List<Integer>> res, int[] nums, int i, List<Integer> list) {
        if (i == nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (list.contains(nums[j])) continue;
            list.add(nums[j]);
            processArray(res, nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}