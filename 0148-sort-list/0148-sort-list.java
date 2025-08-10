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
    public static ListNode head2 = null;
    public static ListNode tail2 = null;
    public static void append(int val)
    {
        ListNode newnode = new ListNode(val);
        if(head2 == null)
        {
            head2 = newnode;
            tail2 = newnode;
        }
        else
        {
            tail2.next = newnode;
            tail2 = newnode;
        }
    }
    public ListNode sortList(ListNode head) {
        head2 = null;
        tail2 = null;
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);
        for(Integer x : list)
        {
            append(x);
        }
        return head2;
    }
}