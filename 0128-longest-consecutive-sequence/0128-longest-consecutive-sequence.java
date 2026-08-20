class Solution {

    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int max = 1;
        int c = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] - 1 == nums[i - 1]) {
                c++;
            } else {
                c = 1;
            }

            if (c > max) {
                max = c;
            }
        }

        return max;
    }
}