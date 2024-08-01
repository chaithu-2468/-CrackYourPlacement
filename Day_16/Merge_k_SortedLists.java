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
    static class Info implements Comparable<Info>{
        int data;
        ListNode node;
        Info(int data , ListNode node){
            this.data = data;
            this.node = node;

        }

        @Override
        public int compareTo(Info i2){
            return this.data - i2.data;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null) return null;

        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i=0 ; i<lists.length ; i++){
            ListNode curr = lists[i];
            if(curr == null) continue;
            pq.offer(new Info(curr.val , curr));
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(!pq.isEmpty()){
            ListNode curr = pq.poll().node;
            temp.next = curr;
            temp = temp.next;
            curr = curr.next;
            if(curr != null)   pq.offer(new Info(curr.val , curr));
        }

        return dummy.next;
    }
}