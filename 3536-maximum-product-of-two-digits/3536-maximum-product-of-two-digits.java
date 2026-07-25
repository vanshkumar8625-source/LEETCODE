class Solution {
    public int maxProduct(int n) {
        int l = 0;
        int sl = 0;
        while (n > 0) {
            int d = n % 10;

            if (d >= l) {
                sl = l;
                l = d;
            } else if (d > sl) {
                sl = d;
            }
            n = n / 10;
        }
        return l * sl;
    }
}