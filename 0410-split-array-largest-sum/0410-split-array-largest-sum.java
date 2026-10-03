class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int parts = 1;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    parts++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }

            if (parts <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}