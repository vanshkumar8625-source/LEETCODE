class Solution {
    public int minChanges(String s) {
        int count = 0;
        int f = 0;
        int S = 1;
        while (S < s.length()) {
            if (s.charAt(f) != s.charAt(S)) {
                count++;
            }
            f += 2;
            S += 2;
        }
        return count;
    }
}