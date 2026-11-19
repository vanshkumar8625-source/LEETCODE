class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        String ans = "";
        while(n > 0){
            int d = n % 2;
            ans += d;
            n = n / 2;
        }
        for(int i = 0; i < ans.length(); i++){
            if(ans.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}