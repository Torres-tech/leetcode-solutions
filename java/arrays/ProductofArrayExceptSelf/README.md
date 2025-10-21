# Product to Array Except Self

## Problem
You are given an integer array nums.
You need to create another array, answer, where each element at index i is equal to the product of all the numbers in the array except nums[i].

For example, if nums = [1, 2, 3, 4],
then answer = [24, 12, 8, 6] because:

for index 0 → 2×3×4 = 24

for index 1 → 1×3×4 = 12

for index 2 → 1×2×4 = 8

for index 3 → 1×2×3 = 6

The challenge includes several important constraints:

You cannot use division to compute the result.

The algorithm must run in O(n) time.

You should aim for O(1) extra space (the result array does not count as extra space).
## Solution Description

Solution Explanation (Simple)

Left Pass:
Move from left to right and store the product of all numbers before each index.
Example with nums = [1, 2, 3, 4]:

Left products = [1, 1, 2, 6]

Right Pass:

Move from right to left and multiply each position by the product of all numbers after it.

Right products = [24,12,4,1]

Final result = [24, 12, 8, 6]
## Complexity Analysist
### Time Complexity

The algorithm uses two linear passes over the array:
one from left to right (for left products) and one from right to left (for right products).

Each pass touches every element exactly once and performs constant work per iteration.

Therefore, the total time complexity is:

O(n) + O(n) = O(n)

### Space Complexity

The algorithm only uses:

The output array answer (which doesn’t count as extra space per the problem statement).

Two scalar variables (leftProduct and rightProduct) for tracking cumulative products.

No additional arrays or data structures are used.

Therefore, the extra space used is constant:
O(1)
If you include the result array itself, the total memory usage is O(n), but the additional working space remains O(1).


