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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        int preSum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0,dummy);

        ListNode curr = head;
        while(curr!=null)
        {
            preSum += curr.val;
            if(!map.containsKey(preSum))
            {
                map.put(preSum,curr);
            }
            else
            {
                ListNode prev = map.get(preSum);
                ListNode temp = prev.next;
                int tempSum = preSum;
                while(temp != curr)
                {
                    tempSum += temp.val;
                    map.remove(tempSum);
                    temp = temp.next;
                }
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}