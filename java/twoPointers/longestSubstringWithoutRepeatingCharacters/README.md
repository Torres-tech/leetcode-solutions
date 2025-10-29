# Longest Substring Without Repeating Characters

# Problem 

Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
# Solution Description

1. We use a set (charSet) to keep track of unique characters in the current substring.
2. We maintain two pointers, left and right, to represent the boundaries of the current substring.
3. The maxLength variable keeps track of the length of the longest substring encountered so far.
4. We iterate through the string using the right pointer.
5. If the current character is not in the set (charSet), it means we have a new unique character.
6. We insert the character into the set and update the maxLength if necessary.
7. If the character is already present in the set, it indicates a repeating character within the current substring.
8. In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
9. We insert the current character into the set and continue the iteration.
10. Finally, we return the maxLength as the length of the longest substring without repeating characters.

# Complexity Analysist

### Time Complexity: O(n)

The algorithm uses the sliding window technique with two pointers: left and right.
Each character in the string is visited at most twice:

Once when expanding the window using right

Once when shrinking the window using left

Since each operation inside the loop is either a constant-time check or a constant-time update on a HashSet, the overall time complexity stays linear with respect to the string length.

### Space Complexity: O(min(n, k))

The HashSet (charSet) stores characters currently in the sliding window, and it can grow only until there are no repeating characters.

Worst case: string contains all unique characters (e.g., "abcdef...")

Then the HashSet will likely store up to n characters
