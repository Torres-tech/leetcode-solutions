# Remove Element

# Problem Summary
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn&#39;t matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.


 
# Intuition
The array should be compacted so that every element different from val gets moved to the front with no gaps. Because we must do this in place and we do not care about what stays beyond the first k cells, a natural idea is to keep a write pointer that always indicates where the next kept element should be written. We simply scan the array once; whenever we see a value that should remain, we copy it to the current write position and advance that position. In effect, we are streaming all valid values toward the front, overwriting the discarded ones as we go, which satisfies the in-place requirement and avoids extra storage.

# Approach (Two-Pointer Write-Through)
Walk the array with an index i that reads each element exactly once. Maintain a second index index (sometimes called write or k) that tracks the next slot for a value we intend to keep. If nums[i] != val, we assign nums[index] = nums[i] and increment index. If nums[i] == val, we do nothing and continue scanning. This single pass guarantees that the first index elements are exactly the values we kept, in their original relative order, while everything after index - 1 is unspecified by the problem statement and may be ignored. The function finally returns index, which is the count of retained elements.

# Correctness Argument
By construction, index is incremented exactly once for each element not equal to val, so at termination it equals the number of elements we keep. For every position p < index, nums[p] was assigned from some nums[i] where nums[i] != val, hence no kept position stores a removed value. Conversely, for every nums[i] != val encountered, we wrote it to a unique position p and advanced index, so all valid elements are represented in the prefix [0, index). Therefore the function returns the correct k and leaves the first k positions containing exactly the elements not equal to val in their original order, which is acceptable.

# Complexity
Time complexity: O(n) because each element is examined once and written at most once.

Space complexity: O(1) since we only use a few scalar variables regardless of input size and perform all updates in place.



#Dry Run Example

Input: nums = [0,1,2,2,3,0,4,2], val = 2

Start index = 0.

i=0: nums[0]=0 != 2 → write nums[0]=0, index=1.

i=1: 1 != 2 → write nums[1]=1, index=2.

i=2: 2 == 2 → skip.

i=3: 2 == 2 → skip.

i=4: 3 != 2 → write nums[2]=3, index=3.

i=5: 0 != 2 → write nums[3]=0, index=4.

i=6: 4 != 2 → write nums[4]=4, index=5.

i=7: 2 == 2 → skip.

Return index = 5. Valid prefix is [0,1,3,0,4].
