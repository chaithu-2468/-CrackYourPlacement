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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null )   return head;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy , curr = head;

        while(curr != null){
            if(curr.val != val){
                temp.next = curr;
                curr = curr.next;
                temp = temp.next;
            }
            else{
                curr = curr.next;
            }
        }
        temp.next = null;

        return dummy.next;
    }
}