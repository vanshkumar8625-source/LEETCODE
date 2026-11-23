class ProductOfNumbers {
    ArrayList<Integer> prefix = new ArrayList<>();
    public ProductOfNumbers() {
        prefix.add(1);
    }
    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            prefix.add(1);
        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(last * num);
        }
    }
    public int getProduct(int k) {
        int n = prefix.size();
        if (k >= n) {
            return 0;
        }
        int total = prefix.get(n - 1);
        int previous = prefix.get(n - k - 1);
        int ans = total / previous;
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */