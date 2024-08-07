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

    public boolean subTree(TreeNode root , TreeNode subroot){
        if(root == null){
            return false;
        }

        if(root.val == subroot.val){
            if(isIdentical(root , subroot)){
                return true;
            }
        }

        return subTree(root.left , subroot) || subTree(root.right , subroot);
    }

    public boolean isIdentical(TreeNode root , TreeNode subroot){
        if(root == null && subroot == null){
            return true;
        }
        else if(root == null || subroot == null || root.val != subroot.val){
            return false;
        }
        if(!isIdentical(root.left , subroot.left)){
            return false;
        }
        if(!isIdentical(root.right , subroot.right)){
            return false;
        }

        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return subTree(root , subRoot);
    }
}