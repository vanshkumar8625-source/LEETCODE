import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int diff = 0;

        for (int i = 1; i < n; i++) {
            diff = Math.max(diff, nums[i] - nums[i - 1]);
        }

        return diff;
    }
}