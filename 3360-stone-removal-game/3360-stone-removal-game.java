class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean alice = true;

        for (int i = 10; i <= n; i--) {
            if (n < remove) {
                return !alice;
            }
            n -= remove;
            remove--;
            alice = !alice;
        }
        return !alice;
    }
}