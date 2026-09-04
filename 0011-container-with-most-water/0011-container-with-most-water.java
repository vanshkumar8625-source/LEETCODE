class Solution {
    public int maxArea(int[] height) {
        int m = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r){
            int a = (r - l) * Math.min(height[l] , height[r]);
            if(a > m){
                m = a;
            }
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return m;
    }
}