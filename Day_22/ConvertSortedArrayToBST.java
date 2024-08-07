/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums , 0 , nums.length-1);
    }

    public TreeNode helper(int[] arr , int si , int ei){
        if(si > ei) return null;

        int mid = si + (ei-si)/2;
        TreeNode curr = new TreeNode(arr[mid]);
        curr.left = helper(arr , si , mid-1);
        curr.right = helper(arr , mid+1 , ei);

        return curr;
    }
}