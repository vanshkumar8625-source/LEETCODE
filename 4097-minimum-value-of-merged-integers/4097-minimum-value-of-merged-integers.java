class Solution {
    public int minMergedInteger(int[] nums) {
       int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            int temp=nums[i+1];
            int digit=1;
            while(temp>0){
                digit*=10;
                temp/=10;
            }
            int num=nums[i]*digit+nums[i+1];
            min = Math.min(min,num);
        }
        return min;
    }
}