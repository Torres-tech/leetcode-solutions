# 3Sum

# Problem 

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

# Solution Description
1️⃣ Sort the array

First, sort the array in ascending order.
Sorting helps in two major ways:

It allows the use of the two-pointer technique efficiently.

It makes it easy to skip duplicates, ensuring that each triplet appears only once.

After sorting, for example:

[-1, 0, 1, 2, -1, -4] → [-4, -1, -1, 0, 1, 2]

2️⃣ Fix one number (nums[i]) at a time

We use a loop to fix one element at index i as the first element of the triplet.
Then we try to find two other numbers (nums[left] and nums[right]) such that their sum equals -nums[i].

For each fixed i:

The current target is target = -nums[i].

3️⃣ Use two pointers (left and right)

After fixing one number:

Set left = i + 1 (the element after i)

Set right = n - 1 (the last element in the array)

Now, move left and right based on the sum:

If nums[i] + nums[left] + nums[right] < 0 → move left++ (need a bigger sum)

If nums[i] + nums[left] + nums[right] > 0 → move right-- (need a smaller sum)

If the sum is exactly 0 → record the triplet as a valid combination.

4️⃣ Skip duplicates

To ensure uniqueness:

If the current number nums[i] is the same as the previous one, skip it (avoid repeating the same starting number).

After finding a valid triplet, skip all duplicate numbers for both left and right pointers to avoid repeating the same combination.

This ensures that every triplet in the result is unique.

5️⃣ Continue searching

After finding one valid triplet and skipping duplicates, move both pointers inward:

left++

right--
Then continue checking until left >= right.

Repeat this process for all possible i values until all unique triplets are found.

# Complexity Analysist

### Time Complexity - O(n²)
Sorting takes O(n log n), and for each fixed i, the two-pointer scan runs in O(n). So total = O(nlog n + n²) ≈ O(n²)

### Space Complexity - O(1) (or O(k) for result)    
Only uses a few extra variables for pointers; main space is for output storage, not algorithm overhead.
