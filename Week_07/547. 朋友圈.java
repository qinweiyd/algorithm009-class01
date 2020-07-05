class Solution {
    class UF {
        private int count;
        private int[] parent;
        private int[] size;
        public UF(int n) {
            this.count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }
        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        public boolean connected (int p, int q) {
            return find(p) == find(q);
        }
        public void union (int p, int q) {
            int rootP = find(p), rootQ = find(q);
            if (rootP == rootQ) return;
            if (size[rootP] > size[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            }else {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            }
            count--;
        }
        public int count() {
            return this.count;
        }
    }
    public int findCircleNum(int[][] M) {
        int n = M.length;
        UF uf = new UF(n);
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
        }
        return uf.count;
    }
}