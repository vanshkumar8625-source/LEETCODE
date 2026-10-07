class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder x = new StringBuilder(s);
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                c++;
            } else if(s.charAt(i) == ')'){
                if(c == 0){
                    x.setCharAt(i , '#');
                } else {
                    c--;
                }
            }
        }

        c = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ')'){
                c++;
            } else if(s.charAt(i) == '('){
                if(c == 0){
                    x.setCharAt(i , '#');
                } else {
                    c--;
                }
            }
        }
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < x.length(); i++){
            if(x.charAt(i) != '#'){
                ans.append(x.charAt(i));
            }
        }
        return ans.toString();
    }
}