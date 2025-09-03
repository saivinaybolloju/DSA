//https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if (root == null) return ans;
        qu.add(root);        
        while(!qu.isEmpty()){
            int n=qu.size();
            ArrayList<Integer>ar=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = qu.poll();
                ar.add(node.val);
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            ans.add(ar);
        }
        return ans;
    }
}
