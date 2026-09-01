class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;
        int p = 1;
        while(n > 0){
            int d = n % 10;
            s = s + d;
            p = p * d;
            n = n / 10;
        }
        return p - s;
    }
}