class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && nums[i] == nums[j]) {
                    c++;
                }
            }
        }
        return c;
    }
}