# Contains Duplicate

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

## Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

## Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

## Approach 1: Brute Force
Check every possible pair of numbers
Time Complexity: 0(n²)
Space Complexity 0(1)

## Approach 2: HashSet (Optimized) 
We iterate through the array and use a HashSet to store numbers encountered. For each element, we check if it already exists in the set. If yes, return true (duplicate found). Otherwise, add it to the set and continue. If no duplicates are detected, return false
Time Complexity: 0(n) on average 
Space Complexity: 0(n)
