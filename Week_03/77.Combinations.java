import java.util.ArrayList;
import java.util.List;

class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        processArray(res, n, 1, k, new ArrayList<Integer>());
        return res;
    }
    public void processArray(List<List<Integer>> res, int n, int start, int k, List<Integer> list) {
        if (k == list.size()) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int j = start; j <= n; j++) {
            list.add(j);
            processArray(res, n, j + 1, k, list);
            list.remove(list.size() - 1);
        }
    }
}