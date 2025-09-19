# Valid Palindrome

Given a string s, return true if it is a palindrome, otherwise return false.

* A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

* Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

### Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

### Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.


## Solution

- We solve this using the two-pointer technique:

Start one pointer at the left (i = 0) and one at the right (j = s.length() - 1).

Move both pointers toward the center:

Skip over characters that are not letters or digits.

Compare the two characters (after converting to lowercase).

If at any point the characters don’t match → return false.

If we finish the loop without mismatches → return true.

## Complexity Analysis

* Time Complexity: O(n)

Each character is checked at most once, so the algorithm scales linearly with input size.

*Space Complexity: O(1)

No extra storage needed apart from a few integer pointers.
