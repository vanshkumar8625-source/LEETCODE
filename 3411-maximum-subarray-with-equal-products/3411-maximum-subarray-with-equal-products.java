class Solution {
    public int GCD(int a , int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int ml = 0;

        for (int i = 0; i < nums.length; i++) {
            int p = 1;
            int gcd = nums[i];
            int lcm = nums[i];

            for (int j = i; j < nums.length; j++) {
                p = p * nums[j];

                gcd = GCD(gcd, nums[j]);

                lcm = (lcm * nums[j]) / GCD(lcm, nums[j]);

                if (p == gcd * lcm) {
                    int l = j - i + 1;
                    ml = Math.max(ml, l);
                }
            }
        }
        return ml;
    }
}