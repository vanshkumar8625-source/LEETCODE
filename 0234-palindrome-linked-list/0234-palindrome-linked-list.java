class Solution {
    public boolean isPalindrome(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int[] arr = new int[n];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            if(arr[l] != arr[r]){
                return false;
            }
            l++;
            r--;
        } 
        return true;
    }
}