import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
         
        // Step 1: Add all numbers to a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Loop through each number
        for (int num : set) {
            // Step 3: Only start counting if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Step 5: Update longest if this sequence is longer
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
