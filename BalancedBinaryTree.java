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
    int heightOfTree(TreeNode root){
        return (root!=null)?1+Math.max(heightOfTree(root.left),heightOfTree(root.right)):0;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)  return true;
        while(root!=null){
            int left=heightOfTree(root.left);
            int right=heightOfTree(root.right);
            if(Math.abs(left-right)>1)  return false;
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return true;
    }
}
