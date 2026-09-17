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

    int len(ListNode head){
        ListNode temp = head;

        int c = 0;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        return c;
    }
    public ListNode reverseList(ListNode head) {
        int n = len(head);

        int arr[] = new int[n];
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        i = n - 1;
        temp = head;
        while(i >= 0){
            temp.val = arr[i];
            i--;
            temp = temp.next;
        }
        return head;
    }
}