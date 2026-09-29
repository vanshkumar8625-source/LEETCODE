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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int n = 0, m = 0;
        ListNode temp = list1;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        temp = list2;
        while (temp != null) {
            m++;
            temp = temp.next;
        }

        int[] arr = new int[n + m];
        int i = 0;
        temp = list1;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        temp = list2;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);

        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        temp = head;
        i = 1;
        while (i < arr.length) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
            i++;
        }
        return head;
    }
}