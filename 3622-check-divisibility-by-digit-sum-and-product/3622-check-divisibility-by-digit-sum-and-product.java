class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0;
        int p = 1;
        int temp = n;
        while(temp > 0){
            s = s + (temp % 10);
            p = p * (temp % 10);
            temp = temp / 10;
        }
        return n % (s + p) == 0;
    }
}