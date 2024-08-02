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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode leftprev = dummy;
        ListNode curr = head;
        for(int i=0 ; i<left-1 ; i++){
            leftprev = leftprev.next;
            curr = curr.next;
        }

        ListNode temphead = curr;

        ListNode prev = null , next = null;

        for(int i=0 ; i<right-left+1 ; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        leftprev.next = prev;
        temphead.next = curr;

        return dummy.next;
    }
}