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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)   return head;
        ListNode lesshead = null , lesstail = null;
        ListNode morehead = null , moretail = null;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                if(lesshead == null){
                    lesshead = lesstail = new ListNode(temp.val);
                    
                }
                else{
                    lesstail.next = new ListNode(temp.val);
                    lesstail = lesstail.next;
                }
            }
            else{
                if(morehead == null){
                    morehead = moretail = new ListNode(temp.val);
                }
                else{
                    moretail.next = new ListNode(temp.val);
                    moretail = moretail.next;
                }
            }

            temp = temp.next;
        }
       

        if(lesshead == null)    return morehead;

        // if(lesstail.next != null) lesstail.next = null;
        // if(moretail.next != null) moretail.next = null;
        
        lesstail.next = morehead;
        return  lesshead;
    }
}