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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)   return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode curr = head.next;

        while(curr != null){
            boolean isDuplicate = false;
            while(curr != null && temp.next.val == curr.val){
                isDuplicate = true;
                curr = curr.next;
            }
            if(isDuplicate){
                temp.next = curr;
            }
            else{
                temp = temp.next;
            }
            if(curr != null)    curr = curr.next;
        }

        return dummy.next;
    }
}