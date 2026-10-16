class StockSpanner {
    int[] arr;
    int n;

    public StockSpanner() {
        arr = new int[10000];
        n = 0;
    }

    public int next(int price) {
        arr[n] = price;
        n++;

        int span = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] <= price) {
                span++;
            } else {
                break;
            }
        }

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */