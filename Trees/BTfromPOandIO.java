//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

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
    TreeNode constructTree(int []preorder,int i1,int j1,int[] inorder,int i2,int j2,HashMap<Integer,Integer>hm){
        if(j1<i1||j2<i2)    return null;
        TreeNode root=new TreeNode(preorder[i1]);
        int length=hm.get(root.val)-i2;
        root.left=constructTree(preorder,i1+1,i1+length,inorder,i2,hm.get(root.val)-1,hm);
        root.right=constructTree(preorder,i1+length+1,j1,inorder,hm.get(root.val)+1,j2,hm);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return constructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
    }
}
