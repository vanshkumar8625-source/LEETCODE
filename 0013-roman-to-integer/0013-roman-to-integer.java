class Solution {
    int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        return 1000; 
    }
    public int romanToInt(String s) {
        int ans = 0;

        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            char chnext = s.charAt(i+1);

            if(value(ch) < value(chnext)){
                ans = ans - value(ch);
            } else {
                ans = ans + value(ch);
            }
        }
        ans += value(s.charAt(s.length() - 1));
        return ans;
    }
}