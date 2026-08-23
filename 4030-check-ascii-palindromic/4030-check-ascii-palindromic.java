class Solution {

    public static String convertToBinary(char c) {
        int n = c;
        String binary = "";

        for (int i = 0; i < 8; i++) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        return binary;
    }

    public boolean isPalindromic(String s) {

        String bits = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            String binary = convertToBinary(c);

            bits = bits + binary;
        }

        int l = 0;
        int r = bits.length() - 1;

        while (l < r) {

            if (bits.charAt(l) != bits.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}