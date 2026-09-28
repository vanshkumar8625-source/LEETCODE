class Solution {
    public int maxDepth(String s) {
        int md = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                int d = 0;
                for(int j = 0; j <= i; j++){
                    if(s.charAt(j) == '('){
                        d = d + 1;
                    } else if(s.charAt(j) == ')'){
                        d = d - 1;
                    }
                }
                md = Math.max(md,d);
            }
        }
        return md;
    }
}