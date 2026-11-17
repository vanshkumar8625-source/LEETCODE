class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] d = new int[n];
        if (n == 1) return nums[0];
        d[0] = nums[0];
        d[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(nums[i] + d[i - 2], d[i - 1]);
        }
        return d[n - 1];    
    }
}