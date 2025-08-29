//https://leetcode.com/problems/binary-tree-right-side-view/

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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
          Queue<TreeNode> qu=new LinkedList<>();
        if (root == null) return ans;
        qu.add(root);        
        while(!qu.isEmpty()){
            int n=qu.size();
            int val=0;
            for(int i=0;i<n;i++){
                TreeNode node = qu.poll();
                val=node.val;
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            ans.add(val);
        }
        return ans;
    }
}
