class Solution {
    int m, n;
    List<String> res = new ArrayList<String>();
    public List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;
        TrieNode root = buildTrie(words);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, root, i, j);
            }
        }
        return res;
    }
    public void dfs(char[][] board, TrieNode node, int i, int j) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        if (i < 0 || i >= m || j < 0 || j >= n) return;
        char c = board[i][j];
        if (c == '@' || node.next[c - 'a'] == null) return;
        node = node.next[c - 'a'];
        if (node.word != null) {
            res.add(node.word);
            node.word = null;
        }
        board[i][j] = '@';
        for (int q = 0; q < 4; q++) {
            dfs(board, node, i + dx[q], j + dy[q]);
        }
        board[i][j] = c;

    }
    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for (String word : words){
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.next[c - 'a'] == null) node.next[c - 'a'] = new TrieNode();
                node = node.next[c - 'a'];
            }
            node.word = word;
        }
        return root;
    }
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}