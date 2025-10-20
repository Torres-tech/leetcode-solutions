# Top K Frequency Elements

# Problem

You are given an integer array nums and an integer k. The task is to return the k elements that appear most frequently in the array.
In other words, we need to find the top k numbers that occur most often. The order of output does not matter — only the frequency of occurrence does.

For example:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]
Because 1 appears three times, 2 appears twice, and 3 appears once — so the two most frequent numbers are 1 and 2.

The challenge is to do this efficiently — ideally in O(n log k) time, not simply sorting the entire array, which would take O(n log n).

#Solution Description (Step-by-Step Explanation)

The approach is based on counting frequencies and then using a min-heap (priority queue) to efficiently keep track of the top k frequent elements.

## Step 1: Count frequencies using a HashMap

We first traverse through the array nums.

For each number, we increase its count in a HashMap (Map<Integer, Integer>).

After this step, the map contains each unique number as a key, and its number of occurrences as the value.
Example: for [1,1,1,2,2,3], the map would look like {1=3, 2=2, 3=1}.

## Step 2: Use a Min-Heap (PriorityQueue) to keep top k frequent elements

We create a PriorityQueue (min-heap) where the ordering is based on the frequency values — that is, entries with smaller frequencies have higher priority to be removed.

As we go through each entry (key-value pair) in the frequency map:

We insert the entry into the heap.

If the heap size exceeds k, we remove (poll) the smallest element (the one with the lowest frequency).

This ensures that at any point, the heap only keeps the k most frequent numbers seen so far.

## Step 3: Extract the result

Once all entries are processed, the heap contains exactly the k most frequent numbers.

We extract (poll) each element from the heap and store their keys (numbers) into a result array.

Since the heap is ordered by frequency from smallest to largest, we usually fill the result array from back to front to maintain descending order (though order is not strictly required).

## Complexity Analysis
### Time Complexity

Building the frequency map: O(n)
We iterate through the entire nums array once.

Building the heap: O(m log k)
Here, m is the number of unique elements. For each unique element, we insert it into the heap, and in the worst case, each insertion/removal operation takes O(log k) time because the heap’s size never exceeds k.

Since m ≤ n, this simplifies to O(n log k) overall.

Extracting results: O(k log k) (negligible compared to previous steps)

✅ Total Time Complexity: O(n log k)

### Space Complexity

HashMap: O(m), where m is the number of unique elements — used to store frequency counts.

Heap: O(k), storing at most k elements at a time.

Result array: O(k)

✅ Total Space Complexity: O(m + k) → often simplified to O(n) in the worst case when all elements are unique.
