//https://leetcode.com/problems/binary-tree-preorder-traversal/

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
    TreeNode getRightMostNode(TreeNode temproot,TreeNode root){
        temproot=temproot.left;
        while(temproot.right!=null&&temproot.right!=root){
            temproot=temproot.right;
        }
        return temproot;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ar=new ArrayList<>();
        if(root==null)  return ar;
        while(root!=null){
            if(root.left==null){
                ar.add(root.val);
                root=root.right;
            }
            else{
                TreeNode rightmostnode=getRightMostNode(root,root);
                if(rightmostnode.right==null){
                    ar.add(root.val);
                    rightmostnode.right=root;
                    root=root.left;
                }else{
                    rightmostnode.right=null;
                    root=root.right;
                }
            }
        }
        return ar;
    }
}
