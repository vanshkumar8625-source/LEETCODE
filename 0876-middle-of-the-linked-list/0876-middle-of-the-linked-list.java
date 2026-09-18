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
    int len(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        return c;
    }
    public ListNode middleNode(ListNode head) {
        int h = len(head);
        int m = h / 2;
        ListNode temp = head;
        for (int i = 0; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }
}