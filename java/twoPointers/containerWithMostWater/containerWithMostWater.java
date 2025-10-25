class Solution {
    public int maxArea(int[] height) {
        // Initialize two pointers: left and right
        int left = 0;
        int right = height.length - 1;
        
        // Variable to store the maximum area found
        int maxArea = 0;

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            // Calculate area and update maxArea if needed
            int area = width * h;
            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++; // move left inward
            } else {
                right--; // move right inward
            }
        }

        // Return the largest area found
        return maxArea;
    }
}
