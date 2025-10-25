# Container With Most Water

# Problem

You are given an array called height[].
Each value represents the height of a vertical line drawn on a graph.

If you choose two lines, they form a container with the x-axis.
The amount of water the container can hold depends on:

Width: the distance between the two lines → (right index - left index)

Height: the shorter of the two lines → min(height[left], height[right])

So the area (amount of water) =

width × min(height of the two lines)


Your goal is to find the maximum area possible between any two lines.

# Solution Description

### Step 1 — Start with two pointers

Put one pointer at the beginning (left = 0)

Put one pointer at the end (right = n - 1)

This gives the widest possible container to start.

### Step 2 — Calculate the area

At each step:

Find the width → (right - left)

Find the smaller height → min(height[left], height[right])

Multiply them → area = width × smaller height

Keep track of the largest area you’ve seen so far.

### Step 3 — Move the pointer

Now, decide which pointer to move:

If the left line is shorter → move left one step to the right.

If the right line is shorter → move right one step to the left.

If both are equal → move either one.

👉 The reason:
The shorter line limits the water height.
Moving the taller line won’t help because the shorter one still sets the maximum height.
So we only move the shorter side to try to find a taller line that could increase the area.

### Step 4 — Repeat

Keep doing this:

Calculate area

Move the shorter pointer

Update the maximum area

Stop when left and right meet.


# Complexity Analysist

### Time Complexity - O(n)    
    Each pointer moves only once (from start to end). So we do one pass through the array. 
### Space Complexity - O(1)
    We only use a few variables (left, right, maxArea). No extra data structures.
