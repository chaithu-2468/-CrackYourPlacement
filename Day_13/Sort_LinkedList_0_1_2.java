
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int[] arr = {0,0,0};
        Node temp = head;
        
        while(temp != null){
            arr[temp.data]++;
            temp = temp.next;
        }
        
        temp = head;
        for(int i=0 ; i<3 ; i++){
            
            while(arr[i]-- >0){
                temp.data = i;
                temp = temp.next;
            }
        }
        
        return head;
    }
}
