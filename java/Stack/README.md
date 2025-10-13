# Problem
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false


# Thinking Solution

Here’s the step-by-step reasoning for choosing Stack algorithm to solve the problem:

1. Create a stack (we can use Stack<Character> in Java).

2. Iterate through each character in the string:

If the character is an opening bracket ('(', '{', '['), push it onto the stack.

If it’s a closing bracket (')', '}', ']'):

    Check if the stack is empty. If it’s empty, it means there’s a closing bracket without an opening one → return false.

    Otherwise, peek at the top of the stack (the most recent opening bracket).

    If the top of the stack matches the current closing bracket (for example, '(' with ')'), then pop it from the stack.

    If it doesn’t match, then the string is invalid → return false.

After processing the entire string, if the stack is not empty, it means there are unmatched opening brackets left → return false.

If the stack is empty, it means all brackets matched properly → return true.


# Complexity Analyzist

Time complexity: O(n) — each character is processed once.

Space complexity: O(n) — in the worst case (all opening brackets), the stack can hold all characters.

