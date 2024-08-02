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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)   return;

        ListNode slow = head , fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode left = head ;

        ListNode prev = null , curr = mid , next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev;

        while(left != null && right != null && right != mid){
            ListNode leftnext = left.next;
            ListNode rightnext = right.next;

            left.next = right;
            right.next = leftnext;

            left = leftnext;
            right = rightnext;
        }

        

    }
}