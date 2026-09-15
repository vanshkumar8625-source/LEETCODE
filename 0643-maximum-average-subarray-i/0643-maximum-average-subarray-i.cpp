class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int a = 0;
        int ma = 0;
        for(int i = 0; i < k; i++){
            a = (nums[i] + a);
        }
        ma = a;
        for(int i = k; i < nums.size(); i++){
            a = a + nums[i] - nums[i - k];
            ma = max(ma , a);
        }
        return (double)ma / k;
    }
};