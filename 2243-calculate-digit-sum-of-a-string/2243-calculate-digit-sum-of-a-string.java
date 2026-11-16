class Solution {
    public static int sum(String s) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            ans += s.charAt(i) - '0';
            i++;
        }
        return ans;
    }
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                int endIndex = Math.min(j + k, s.length());
                String x = s.substring(j, endIndex);
                int val = sum(x);
                sb.append(val);
                j = endIndex;
            }
            s = sb.toString();
        }
        return s;
    }
}