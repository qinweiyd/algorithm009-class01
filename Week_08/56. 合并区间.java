class Solution {
    public int[][] merge(int[][] intervals) {
        Listint[] res = new ArrayListint[]();
        int m = intervals.length;
        if (m == 0) return res.toArray(new int[0][]);
        Arrays.sort(intervals, (a, b) - a[0] - b[0]);
        int i = 0;
        while (i  m) {
            int left = intervals[i][0], right = intervals[i][1];
            while (i  m - 1 && intervals[i + 1][0] = right) {
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            res.add(new int[]{left, right});
            i++;
        }
        return res.toArray(new int[0][]);
    }
}