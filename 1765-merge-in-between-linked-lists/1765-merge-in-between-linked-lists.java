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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int count = 0;
        ListNode prev = null;
        while(curr != null && count < a)
        {
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = list2;
        ListNode next = null;
        while(curr != null && count <= b)
        {
            curr = curr.next;
            count++;
        }
        next = curr;
        ListNode temp = list1;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = next;
        return list1;
    }
}