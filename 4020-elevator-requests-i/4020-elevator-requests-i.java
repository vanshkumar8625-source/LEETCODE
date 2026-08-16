class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum = 0;
        int l = 0;

        for(int i = 0; i < requests.length; i++){
            sum = sum + Math.abs(l - requests[i]);
            l = requests[i];
        }
        return sum;
    }
}