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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)    return root;
        if(root.left == null && root.right == null) return root;

        // Approach - I
        change(root);
        return root;

        // Approach - II
        // TreeNode left = invertTree(root.left); // left side 
        // TreeNode right = invertTree(root.right); //right side

        // root.left = right;
        // root.right = left;

        // return root;
    }

    public static void change(TreeNode root){
        if(root.left == null && root.right == null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null) change(root.left);
        if(root.right != null) change(root.right);
    }
}