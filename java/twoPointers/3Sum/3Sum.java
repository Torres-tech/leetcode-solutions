import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // List < List < Integer> > = [[ , , ],[ , , ],[ , , ]]
        if (nums == null || nums.length < 3) return res; // res = []

        Arrays.sort(nums); // 1) sort to enable two-pointer sweep + easy duplicate skipping
        int n = nums.length;

        //we have n -2 because we need nums[i], nums[left] & nums[right], so if i < n -1 , or i < n, the nums left or right can't match, [0,1,2,3,4,5], n = 6, we stop at i = 3 (i < n - 2) beceause if i = 4, nums [left] = 5, but nums [right] out of bound
        for (int i = 0; i < n - 2; i++) {
            // 2) skip duplicate "first" elements to avoid repeating same triplet families
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 3) early stop: once nums[i] > 0, remaining are >= nums[i], so sum can't be 0
            if (nums[i] > 0) break;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++; // need a larger total → move left forward
                } else if (sum > 0) {
                    right--; // need a smaller total → move right backward
                } else {
                    // found a valid triplet
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 4) skip duplicates around left and right to keep triplets unique
                    //this means after sum tripplet added to the list, if the next element equal to the last one just added to the triplet list, skip it
                    int leftVal = nums[left], rightVal = nums[right];
                    while (left < right && nums[left] == leftVal) left++;
                    while (left < right && nums[right] == rightVal) right--;
                }
            }
        }
        return res;
    }
}
// [ -4, -1 , -1, 0, 1, 2]
