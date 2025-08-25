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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;
        
        ListNode curr = head;
        int count = 0;
        while(curr != null)
        {
            if(count % 2 == 0)
            {
                curr1.next = curr;
                curr1 = curr1.next;
            }
            else
            {
                curr2.next = curr;
                curr2 = curr2.next;
            }
            curr = curr.next;
            count++;
        }
        curr2.next = null;
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}