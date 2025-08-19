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
    public static int Gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
            return head;
        ListNode dummy = new ListNode(0,head);
        ListNode curr = head;
        while(curr != null && curr.next != null)
        {
            ListNode ins = new ListNode(Gcd(curr.val,curr.next.val));
            ListNode store = curr.next;
            curr.next = ins;
            ins.next = store;
            curr = store;
        }
        return dummy.next;
    }
}