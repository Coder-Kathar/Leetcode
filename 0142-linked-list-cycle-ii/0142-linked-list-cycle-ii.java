/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static ListNode slow = null;
    static ListNode fast = null;
    public ListNode detectCycle(ListNode head) {
        if(!isCycle(head))
            return null;
        ListNode curr = head;
        while(curr != slow)
        {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
    public static boolean isCycle(ListNode head)
    {
        slow = head;
        fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}