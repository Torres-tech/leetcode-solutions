class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Bitmasks for rows, columns, and 3×3 boxes
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;           // ignore empty

                int d = ch - '0';                  // '1'..'9' -> 1..9
                int bit = 1 << (d - 1);           // map 1..9 to bits 0..8
                int b = (r / 3) * 3 + (c / 3);     // 3×3 box index: 0..8

                // If this digit already appeared in the row, column, or box -> invalid
                if ((rows[r] & bit) != 0 || (cols[c] & bit) != 0 || (boxes[b] & bit) != 0) {
                    return false;
                }

                // Mark the digit as seen
                rows[r]  |= bit;
                cols[c]  |= bit;
                boxes[b] |= bit;
            }
        }
        return true; // no conflicts found
    }
}
