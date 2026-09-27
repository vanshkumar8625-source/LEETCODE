class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length; 
        int  ans [] = new int [n];
        int x=0;
        int max=0;
        Arrays.sort(nums);
        for (int i=0;i<n;i++){
            int c=0;
            for (int j=0;j<n;j++){
                if (nums[i]== nums[j])
                 c++;          
            }
            max=Math.max(max,c);
        }
        for (int i=1;i <= max;i++){
            for (int j=0;j < n;j++){
                if (j>0 && nums[j]== nums[j-1]) continue;

                int c=0;
                for (int k=0;k<n;k++){
                    if (nums[k]== nums[j]) c++;
                }
                if (c>=i) ans[x++]=nums[j];
            }
        }
        return ans;
    }
}