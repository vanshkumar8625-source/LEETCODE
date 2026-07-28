class Solution {
public:
    string smallestPalindrome(string s) {
        int count[26] = {0};

        for (char ch : s) {
            count[ch - 'a']++;
        }

        string left = "";
        string middle = "";

        for (int i = 0; i < 26; i++) {
            char ch = 'a' + i;

            for (int j = 0; j < count[i] / 2; j++) {
                left += ch;
            }

            if (count[i] % 2 == 1) {
                middle = ch;
            }
        }

        string right = left;
        reverse(right.begin(), right.end());

        return left + middle + right;
    }
};