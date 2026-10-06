class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0;
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                c++;
            } else if(s.charAt(i) == ')'){
                if(c > 0){
                    c--;
                } else {
                    ans++;
                }
            }
        }
        ans = ans + c;

        return ans;
    }
}