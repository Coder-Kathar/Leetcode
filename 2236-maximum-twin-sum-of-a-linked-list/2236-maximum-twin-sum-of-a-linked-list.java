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
    public int pairSum(ListNode head) {
        int total = 0;
        ListNode temp = head;
        while(temp != null)
        {
            total += 1;
            temp = temp.next;
        }
        System.out.println(total);
        int count = 0;
        ListNode curr = head;
        Map<Integer,Integer> map = new HashMap<>();
        while(curr != null)
        {
            map.put(count,curr.val);
            count++;
            curr = curr.next;
        }
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<total/2;i++)
        {
            int val1 = map.get(i);
            int val2 = map.get((total - 1 - i));
            int ans = val1 + val2;
            if(ans > maximum)
                maximum = ans;
        }
        return maximum;
    }
}