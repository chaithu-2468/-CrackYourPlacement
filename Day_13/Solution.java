/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // we can solve in 3 methods
        
        // 1. create HashSet of nodes and add all nodes of headA
        // traverse through headB and if we find same node that is already present in hashset 
        // that node will be our ans

        // 2. find sizeA and sizeB of both lists
        // find the difference of sizeA and sizeB
        // move large size list to the difference so that if there is a intersection point
        // both nodes will point at same distance to intersection point
        // move headA and headB step by step if they are equal return node else return empty

        // 3.
        ListNode temp1 = headA , temp2 = headB;

        while(temp1 != temp2 ){
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == null && temp2 == null){
                return temp1;
            }

            if(temp1 == null)   temp1 = headB;
            if(temp2 == null)   temp2 = headA;
        }

        return temp1;

    }
}