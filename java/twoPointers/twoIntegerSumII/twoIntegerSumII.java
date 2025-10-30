class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;                     // start pointer
        int right = numbers.length - 1;   // end pointer
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Since problem says array is 1-indexed, add +1 to each index
                return new int[] {left + 1, right + 1};
            } 
            else if (sum < target) {
                // sum is too small -> move left pointer to the right to increase sum
                left++;
            } 
            else {
                // sum is too large -> move right pointer to the left to decrease sum
                right--;
            }
        }
        
        // This line technically never runs because the problem guarantees one valid solution
        return new int[] {-1, -1};
    }
}
