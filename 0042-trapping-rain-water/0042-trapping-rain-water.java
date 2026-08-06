class Solution {
    public int trap(int[] height) {
        int waterstored = 0;
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0] ;
        right[n - 1] = height[n - 1];

        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i - 1] , height[i]);
        }
        for(int i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1] , height[i]);
        }
        for(int i = 0; i < n; i++){
            int leftmax = left[i];
            int rightmax = right[i];

            int mini = Math.min(leftmax , rightmax);

            waterstored = waterstored + (mini - height[i]);
        }
        return waterstored;
    }
}