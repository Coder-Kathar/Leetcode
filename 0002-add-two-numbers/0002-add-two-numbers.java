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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null)
        {
            int sum = curr1.val + curr2.val + carry;
            if(head == null)
            {
                head = new ListNode(sum % 10);
            }
            else
            {
                ListNode curr = head;
                while(curr.next!=null)
                {
                    curr = curr.next;
                }
                curr.next = new ListNode(sum % 10);
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
            carry = sum / 10;
        }
        while(curr1 != null)
        {
            int sum = curr1.val + carry;
            ListNode curr = head;
            while(curr.next != null)
                curr = curr.next;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr1 = curr1.next;
        }
        while(curr2 != null)
        {
            int sum = curr2.val + carry;
            ListNode curr = head;
            while(curr.next != null)
                curr = curr.next;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr2 = curr2.next;
        }
        if(carry > 0)
        {
            ListNode curr = head;
            while(curr.next != null)
                curr = curr.next;
            curr.next = new ListNode(carry);
        }
        return head;
    }
}