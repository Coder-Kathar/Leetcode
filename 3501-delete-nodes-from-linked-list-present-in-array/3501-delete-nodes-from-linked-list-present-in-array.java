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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
            set.add(x);
        ListNode dummy = new ListNode(0,head);
        ListNode pre = dummy;
        while(pre.next != null)
        {
            if(set.contains(pre.next.val))
                pre.next = pre.next.next;
            else
                pre = pre.next;
        }
        return dummy.next;   
    }
}