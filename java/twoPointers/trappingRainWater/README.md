# Trapping Rain Water

# Problem

You are given an array of non-negative integers where each element represents the height of a bar in a histogram.
The width of each bar is 1. After raining, water may collect in the dips between the bars.

Goal:
Compute how much total water can be trapped between the bars.

# Solution Description

The direct formula above requires knowing both max_left and max_right for every index —
which could be precomputed in O(n) space, but there’s a more elegant O(1) space method.

Step-by-step reasoning:

Initialize two pointers

l = 0, r = n - 1
leftMax = height[l], rightMax = height[r]
res = 0


Move the pointers inward

At each step, compare leftMax and rightMax.

The side with the smaller max is the limiting wall for that side.

If leftMax < rightMax:

The water level on the left is limited by leftMax.

Any bar at l can trap leftMax - height[l] water.

Update leftMax = max(leftMax, height[l]).

Move l++.

Else:

The water level on the right is limited by rightMax.

Any bar at r can trap rightMax - height[r] water.

Update rightMax = max(rightMax, height[r]).

Move r--.

Continue until the two pointers meet.

The accumulated res is the total trapped water.

Intuition behind pointer choice

When leftMax < rightMax, the left wall is definitely the smaller of the two boundaries.
That means, for the left side, we already know the min(leftMax, rightMax) = leftMax.
So we can safely compute water on that side without waiting to know the exact shape of the right side.

The same reasoning applies symmetrically when rightMax <= leftMax.

# Complexity Analysist 
Time - O(n)    

Each element is processed at most once by one of the pointers.

Space - O(1)    
Only a few variables (l, r, leftMax, rightMax, res) are used; no extra arrays needed.
