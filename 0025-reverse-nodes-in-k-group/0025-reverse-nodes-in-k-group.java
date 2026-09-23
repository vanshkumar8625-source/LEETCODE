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

    void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

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

        int s = 0;
        int e = k - 1;
        while (e < n) {
            reverse(arr, s, e);
            s += k;
            e += k;
        }

        temp = head;

        for (int i = 0; i < n; i++) {
            temp.val = arr[i];
            temp = temp.next;
        }

        return head;
    }
}