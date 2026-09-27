class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
        return false;
    }
    int original = x;
    int reversed = 0;

    while(x != 0) {
        int number = x % 10;
        reversed = reversed * 10 + number;
        x = x / 10;
    }
    return original == reversed;
  }
}