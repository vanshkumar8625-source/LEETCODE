class Solution {
    public int calculateScore(int a, int b) {
        int x=0;
        int y=0;
        while (a>0){
            x+=a%2;
            a=a/2;
        }
        while (b>0){
            y+=b%2;
            b=b/2;
        }
        if (x>=y) return x*y;

        return y/x;
    }
}