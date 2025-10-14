# Min Stack
# 1.Problem 
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2


# 2. Solution Explaination
The normal Java Stack can easily perform push, pop, and top,
but it does not provide a built-in method to get the minimum element in constant time.

If we scanned the entire stack each time to find the minimum, it would take O(n) time — too slow.

Key Idea:

    Use an extra stack to track the current minimum value at every level of the main stack.

    Every time we push a new value, we also push the minimum so far onto the second stack.

    When we pop, we pop from both stacks, keeping them perfectly aligned.

    The top of the second stack always contains the current minimum of the stack.

This way:

push() → O(1)

pop() → O(1)

top() → O(1)

getMin() → O(1)

# 3. Time & Space Complexity

Time Complexity

push()   --> O(1)

pop()    --> O(1)

top()    --> O(1)

getMin() --> O(1)

Space Complexity

push()   --> O(1) per element

pop()    --> O(1) per element

top()    --> O(1) 

getMin() --> O(1)

Total Space Complexity    —    O(n) (for both stacks)
