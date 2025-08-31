//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>qu=new LinkedList<>();
        int f=0;
        qu.add(root);
        while(!qu.isEmpty()&&root!=null){
            int n=qu.size();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=qu.poll();
                temp.add(node.val);
                if(node.left!=null)
                    qu.add(node.left);
                if(node.right!=null)
                    qu.add(node.right);
            }
            if(f==0){
                ans.add(temp);
                f=1;
            }
            else{
                Collections.reverse(temp);
                ans.add(temp);
                f=0;
            }
        }
        return ans;
    }
}
