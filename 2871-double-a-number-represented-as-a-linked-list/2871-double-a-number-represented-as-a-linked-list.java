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
    private static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode reversed = reverse(head);
        ListNode dummy = new ListNode(0);
        ListNode point =  dummy;
        int carry = 0;
        ListNode curr = reversed;
        while(curr != null)
        {
            int sum = carry + (curr.val * 2);
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            point = point.next;
        }
        if(carry != 0)
            point.next = new ListNode(carry);
        return reverse(dummy.next);
    }
}