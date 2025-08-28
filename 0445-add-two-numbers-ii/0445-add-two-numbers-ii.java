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
    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null)
        {
            int sum = curr1.val + curr2.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr1 = curr1.next;
            curr2 = curr2.next;
            temp = temp.next;
        }
        while(curr1 != null)
        {
            int sum = curr1.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            curr1 = curr1.next;
        }
        while(curr2 != null)
        {
            int sum = curr2.val + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            curr2 = curr2.next;
        }
        if(carry != 0)
        {
            temp.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }
}