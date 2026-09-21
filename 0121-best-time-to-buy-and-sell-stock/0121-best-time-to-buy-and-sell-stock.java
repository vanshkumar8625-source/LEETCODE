class Solution {
    public int maxProfit(int[] prices) {
        int min_pr = prices[0];
        int max_pro = 0;

        for (int i = 1; i < prices.length; i++) {
            min_pr = Math.min(min_pr, prices[i]);
            max_pro = Math.max(max_pro, prices[i] - min_pr);
        }

        return max_pro;
    }
}