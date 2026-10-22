class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = nums1.length;
        int n = nums2.length;
        int res[] = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            res[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            res[k] = nums2[j];
            j++;
            k++;
        }
        
        if((n+m)%2 == 1){
            double ans = res[(n+m)/2];
            return ans;
        }
        double ans = (res[(n+m)/2] + res[(n+m-1)/2])/2.0;

        return ans;
    }
}