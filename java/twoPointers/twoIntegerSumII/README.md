# Two Integer Sum II

# Problem

You are given a 1-indexed sorted array of integers numbers and a target integer target.
Your task is to find two distinct numbers in the array that add up to the target number.

Return the indices (1-based) of the two numbers as an integer array [index1, index2].

You may assume that:

Each input has exactly one solution.

You cannot use the same element twice.

The input array is sorted in non-decreasing order.

🧠 Example

Input:

numbers = [2, 7, 11, 15]
target = 9


Output:

[1, 2]


Explanation:

2 + 7 = 9

Since array indices start at 1 in this problem, we return [1, 2].

# Solution Description

Because the array is sorted, we can use the two-pointer technique to efficiently find the two numbers that sum to the target.

Start with two pointers:

left pointing at the first element.

right pointing at the last element.

Compute the sum:
sum = numbers[left] + numbers[right]

Compare the sum to the target:

If sum == target → we found our pair → return [left + 1, right + 1]

If sum < target → sum is too small → move left pointer to the right

If sum > target → sum is too large → move right pointer to the left

Continue until the pair is found (guaranteed to exist).

This works because moving pointers adjusts the sum intelligently:

Moving left → increases the total sum.

Moving right → decreases the total sum.

# Complexity Analysist

### Time Complexity - O(n)

Each element is visited at most once as left and right move toward each other.

### Space Complexity - O(1)

Only a few integer variables are used; no extra data structures needed.
