class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int l = 0; l < n - 2; l++) {
            if (l > 0 && nums[l] == nums[l - 1]) {
                // l++;
                continue;
            }
            int m = l + 1;
            int r = n - 1;

            while (m < r) {
                int sum = nums[l] + nums[m] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[l], nums[m], nums[r]));
                    m++;

                   while(m < r && nums[m] == nums[m-1]){
                        m++;
                   }
                } else if (sum < 0) {
                    m++;
                } else {
                    r--;
                }
            }
        }
        return ans;
    }
}