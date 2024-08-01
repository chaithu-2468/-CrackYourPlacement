/* 
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        if(head == null || head.next == null)    return ;
        
        Node slow = head , fast = head.next;
        Node temp = head.next;
        
        while(fast != null && fast.next != null){
            slow.next = slow.next.next;
            fast.next = fast.next.next;
            
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = temp;
    }
}