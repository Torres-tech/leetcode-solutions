# Evaluate RPN

# Problem 

You’re given an arithmetic expression in Reverse Polish Notation (RPN), where every operator follows its operands. For example, the infix expression (1 + 2) * 3 − 4 becomes ["1","2","+","3","*","4","-"]. Evaluate the expression and return the final integer result. Valid tokens are either integers or one of the operators +, -, *, /. Division should truncate toward zero (Java’s integer division already behaves this way). Inputs are guaranteed to be valid, and the result fits in a 32-bit signed integer.

# Solution Description

RPN is tailor-made for a stack. Scan the tokens left to right. When you see a number, push it on the stack. When you see an operator, pop the top two numbers, apply the operator in the correct order, and push the result back. The important ordering detail is for subtraction and division: the first pop is the right operand and the second pop is the left operand, so compute left op right. Repeat until all tokens are processed; the single remaining stack value is the answer.

Your Java implementation does exactly this:

It iterates over tokens.

For + and *, it pops twice, combines, and pushes the result. Order doesn’t matter for these.

For - and /, it pops into a and b, then pushes b - a or b / a to preserve operand order.

For any other token, it parses the string as an integer and pushes it.

Finally, it returns the last value from the stack.

Quick dry run on your example ["1","2","+","3","*","4","-"]:

Push 1 → [1]

Push 2 → [1, 2]

“+” → pop 2,1 → 1+2=3 → push → [3]

Push 3 → [3, 3]

“” → pop 3,3 → 33=9 → push → [9]

Push 4 → [9, 4]

“-” → pop 4,9 → 9−4=5 → push → [5]
Return 5.

# Complexity Analysist 

Time: - O(n)

Each token is processed once; each push/pop is O(1).

Space - O(n) 

in the worst case when reading many numbers before any operator, though at any moment the stack depth is bounded by the expression’s operand/operation structure.
