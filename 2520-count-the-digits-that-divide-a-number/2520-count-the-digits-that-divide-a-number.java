class Solution {
    public int countDigits(int num) {
        if(num < 9){
            return 1;
        }
        int c = 0;
        int ans = num;
        while(num > 0){
            int d = num % 10;
            if( d != 0 && ans % d == 0){
                c++;
            }
            num = num / 10; 
        }
        return c;
    }
}