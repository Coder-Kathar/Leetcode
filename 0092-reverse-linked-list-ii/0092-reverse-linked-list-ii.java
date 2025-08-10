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
    static ListNode head2 = null;
    public static void reverse(List<Integer> l, int le, int ri)
    {
        while(le < ri)
        {
            Integer temp = l.get(le);
            l.set(le,l.get(ri));
            l.set(ri,temp);
            le++;
            ri--;
        }
    }
    public static void append(int val)
    {
        ListNode newnode = new ListNode(val);
        if(head2 == null)
        {
            head2 = newnode;
        }
        else
        {
            ListNode curr = head2;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        head2 = null;
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            l.add(curr.val);
            curr = curr.next;
        }
        reverse(l,left-1,right-1);
        for(int i=0;i<l.size();i++)
        {
            append(l.get(i));
        }
        return head2;
    }
}