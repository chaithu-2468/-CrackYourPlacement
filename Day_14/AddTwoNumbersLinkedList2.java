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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(l1 != null && l2 != null){
            int curr = l1.val + l2.val + carry;

            if(curr > 9){
                carry = 1;
                curr %= 10;
            }
            else{
                carry = 0;
            }
            temp.next = new ListNode(curr);
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int curr = l1.val +  carry;

            if(curr > 9){
                carry = 1;
                curr %= 10;
            }
            else{
                carry = 0;
            }
            temp.next = new ListNode(curr);
            temp = temp.next;

            l1 = l1.next;
        }

         while(l2 != null){
            int curr = l2.val +  carry;

            if(curr > 9){
                carry = 1;
                curr %= 10;
            }
            else{
                carry = 0;
            }
            temp.next = new ListNode(curr);
            temp = temp.next;

            l2 = l2.next;
        }

        if(carry != 0)  temp.next = new ListNode(carry);

        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null , curr = head , next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}