/*class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;
        long num1 = 0;
        long num2 = 0;
        
        Node temp = first;
        while(temp != null){
            num1 = (num1*10)%mod + temp.data;
            temp = temp.next;
        }
        
        temp = second;
        while(temp != null){
            num2 = (num2*10)%mod + temp.data;
            temp = temp.next;
        }
        
        
        return (num1*num2)%mod;
    }
}