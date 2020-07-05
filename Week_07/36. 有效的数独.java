class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set[] row = new Set[9], col = new Set[9], block = new Set[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            block[i] = new HashSet<Character>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!(row[i].add(board[i][j]) 
                && col[j].add(board[i][j]) 
                && block[i / 3 * 3 + j / 3].add(board[i][j]))) return false;
            }
        }
        return true;
    }
}