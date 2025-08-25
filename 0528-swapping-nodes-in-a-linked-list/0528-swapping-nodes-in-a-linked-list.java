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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null)
            return head;
        int count = 0;
        ListNode curr = head;
        while(curr != null)
        {
            count++;
            curr = curr.next;
        }
        ListNode first = head;
        ListNode last = head;
        curr = head;
        int i = 1;
        while(curr != null)
        {
            if(i == k)
                first = curr;
            if(i == count-k+1)
                last = curr;
            curr = curr.next;
            i++;
        }
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        return head;
    }
}