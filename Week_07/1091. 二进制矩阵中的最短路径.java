class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int dx[] = new int[]{-1, -1, -1, 0, 0, 1, 1, 1}, dy[] = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
        int m = grid.length, count = 1;
        if (grid[0][0] == 1 || grid[m - 1][m - 1] == 1) return -1;
        if (m == 1) return count;
        LinkedList<int[]> dq = new LinkedList<int[]>();
        dq.add(new int[]{0, 0});
        while (!dq.isEmpty()) {
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                int[] data = dq.poll();
                for (int j = 0; j < 8; j++) {
                    int x  = data[0], y = data[1];
                    x += dx[j];
                    y += dy[j];
                    if (x == m - 1 && y == m - 1) return count + 1;
                    if (x >= 0 && x < m && y >= 0 && y < m && grid[x][y] == 0) {
                        dq.add(new int[]{x, y});
                        grid[x][y] = 1;
                    }
                }
            }
            count++;
        }
        return -1;

    }
}