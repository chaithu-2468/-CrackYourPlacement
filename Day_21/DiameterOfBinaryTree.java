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
    public int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        helper(root);
        // maxDiameter holds no. of nodes
        // we need to return no.of edges(nodes - 1)
        return maxDiameter-1;
    }

    public int helper(TreeNode root){
        if(root == null)    return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        maxDiameter = Math.max(maxDiameter , left+right+1);

        return Math.max(left,right)+1;
    }
}