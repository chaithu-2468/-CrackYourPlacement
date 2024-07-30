
/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        // Reverse
        Node prev = null , curr = head , next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;
        }
        
        head = prev;
        
        curr = head;
        
        while(curr.next != null){
            if(curr.data > curr.next.data)  curr.next = curr.next.next;
            else                            curr = curr.next;
        }
        
        
        prev = null ; curr = head ; next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;
        }
        
        return prev;
    }
}