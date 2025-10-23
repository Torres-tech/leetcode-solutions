# Valid Sudoku

# Problem
The Valid Sudoku problem asks you to determine whether a given 9×9 Sudoku board is valid based on Sudoku rules. Each row, each column, and each of the nine 3×3 sub-grids (also called boxes) must contain unique digits from 1 to 9, without any repetition. Empty cells are represented by the character '.' and should be ignored when checking for validity. The goal is not to solve the Sudoku, but simply to confirm whether the current board state is valid so far.
# Solution Description
To verify the validity efficiently, you can scan the entire 9×9 board once. For every cell that contains a number (not '.'), you check three conditions:

Row Check: The number has not appeared before in its current row.

Column Check: The number has not appeared before in its current column.

Box Check: The number has not appeared before in its 3×3 sub-box.

You can keep track of which numbers have been seen using either:

Hash sets for each row, column, and box, or

Bitmasks or boolean arrays to mark the digits 1–9 efficiently.

As you visit each filled cell, if you find that the digit already exists in its corresponding row, column, or box, the board is immediately invalid. If you finish scanning all 81 cells without finding a duplicate, the Sudoku is valid.
# Complexity Analysist
Time Complexity: O(1) — Technically O(81) since the board size is fixed (9×9), but in algorithmic terms it’s constant time.

Space Complexity: O(1) — Only a small, fixed amount of additional memory is used (for 9 rows, 9 columns, and 9 boxes), which does not scale with input size.
