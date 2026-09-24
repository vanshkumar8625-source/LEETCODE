/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);

        if(arr.length == 0){
            return null;
        }
        ListNode head2 = new ListNode(arr[0]);
        temp = head2;
        int i = 1;
        while(i < arr.length){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
            i++;
        }
        return head2;
    }
}