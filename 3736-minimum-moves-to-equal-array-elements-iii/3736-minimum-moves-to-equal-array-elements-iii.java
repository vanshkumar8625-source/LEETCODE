class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int max = nums[nums.length - 1];

        for(int i = 0; i < nums.length - 1; i++){
            c += max - nums[i];
        }
        return c;
    }
}