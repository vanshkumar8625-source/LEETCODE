class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int answer = 0;

        for (int h = 0; h <= n; h++) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (citations[i] >= h) {
                    count++;
                }
            }
            if (count >= h) {
                answer = h;
            }
        }
        return answer;
    }
}