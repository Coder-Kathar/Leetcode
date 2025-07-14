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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }
        int ans = 0;
        int pv = 1;
        for(int i = arr.size()-1;i>=0;i--)
        {
            ans = ans + (arr.get(i) * pv);
            pv <<= 1;
        }
        return ans;
    }
}