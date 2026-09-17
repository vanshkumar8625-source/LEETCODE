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
    public ListNode reverseList(ListNode head) {
       ListNode f = null;
        ListNode s = head;
        while(s!=null){
            ListNode n = s.next;
            s.next=f;
            f=s;
            s=n;
        }
        return f;
    }
}