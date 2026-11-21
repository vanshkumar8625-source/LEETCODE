class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);

            map.put(ch,1);
        }
        for (int i = 0; i < stones.length(); i++) {
            char ch1 = stones.charAt(i);

            if (map.containsKey(ch1)) {
                c++;
            }
        }
        return c;
    }
}