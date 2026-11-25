class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int a = 0, b = 0;

        for (int i = 0; i < n - 1; i++) {
            int temp = Math.max(a, b + nums[i]);
            b = a;
            a = temp;
        }

        int x = a;
        a = 0;
        b = 0;

        for (int i = 1; i < n; i++) {
            int temp = Math.max(a, b + nums[i]);
            b = a;
            a = temp;
        }

        return Math.max(x, a);
    }
}