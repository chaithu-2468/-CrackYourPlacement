
// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        Node eh = null , et = null;
        Node oh = null , ot = null;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data % 2 ==0){
                if(eh == null){
                    eh = et = new Node(temp.data);
                }
                else{
                    et.next = new Node(temp.data);
                    et = et.next;
                }
            }
            else{
                if(oh == null){
                    oh = ot = new Node(temp.data);
                }
                else{
                    ot.next = new Node(temp.data);
                    ot = ot.next;
                }
            }
            
            temp = temp.next;
        }
        
        if(eh == null)  return oh;
        
        et.next = oh;
        return eh;
    }
}