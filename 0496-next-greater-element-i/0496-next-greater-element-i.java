class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] ng = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (st.isEmpty() != true && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = st.peek();
            }

            st.push(nums2[i]);
        }

        int[] ans2 = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    ans2[i] = ng[j];
                     break;
                }
            }
        }

        return ans2;
    }
}