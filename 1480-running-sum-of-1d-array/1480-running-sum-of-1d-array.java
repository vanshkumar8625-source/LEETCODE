class Solution {
    public int[] runningSum(int[] num) {
        for(int i = 1; i < num.length; i++){
            num[i] = num[i] + num[i - 1];
        }
        return num;
    }
} 