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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
            set.add(x);
        
        int count = 0;
        boolean flag = false;
        ListNode curr = head;
        while(curr != null)
        {
            if(set.contains(curr.val))
            {
                if(!flag)
                {
                    count++;
                    flag = true;
                }
            }
            else
            {
                flag = false;
            }
            curr = curr.next;
        }
        return count;
    }
}