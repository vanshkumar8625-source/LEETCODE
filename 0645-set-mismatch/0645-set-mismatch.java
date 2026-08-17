class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;

        for(int i = 1; i <= n; i++){
            int c = 0;

            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    c++;
                }
            }
            if(c == 2){
                l = i;
            }
            if(c == 0){
                r = i;
            }
        }
        return new int[] {l , r};
    }
}