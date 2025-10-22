# Longest Consecutive Sequences

# Problem 

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3

# Solution Description

The algorithm efficiently solves this problem using a HashSet, which provides constant-time lookups. The main idea is to detect the beginning of each consecutive sequence and then count how long that sequence continues.

### Store All Elements in a Set:
The algorithm first inserts all the elements from the array into a HashSet. This allows constant-time checking of whether a number exists in the array.

### Identify the Start of a Sequence:
The algorithm then iterates over each number in the set. For each number, it checks whether the previous number (num - 1) exists in the set.

    If the previous number exists, this means the current number is not the start of a new sequence, so it skips it.

    If the previous number does not exist, it means the current number could be the start of a new consecutive sequence.

### Count Consecutive Numbers:
Once a sequence start is found, it counts how many consecutive numbers (num + 1, num + 2, etc.) exist in the set. Each time it finds the next consecutive number, it increments the count.

### Track the Longest Sequence:
For each sequence, the algorithm keeps updating a variable longest that stores the maximum length of all sequences found so far.

### Return the Result:
After processing all elements, it returns the length of the longest consecutive sequence found.

# Complexity Analysist 
## Time Complexity 
O(n) — Each element is inserted into the HashSet once, and each lookup (set.contains) operation takes O(1) on average.

Even though there is a nested while loop, each number is visited at most once when counting sequences, so the total operations still add up to linear time.

## Space Complexity 
O(n) — The extra space is used to store all elements in the HashSet.
Apart from that, only a few integer variables are used for counting and tracking results.
