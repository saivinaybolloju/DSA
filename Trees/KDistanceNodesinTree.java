//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode makeParentNodeLinks(TreeNode root,HashMap<TreeNode,TreeNode>hm){
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                hm.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                hm.put(curr.right,curr);
                q.add(curr.right);
            }
        }return root;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode>hm=new HashMap<>();
        makeParentNodeLinks(root,hm);
        HashMap<TreeNode,Boolean>vis=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(target);
        vis.put(target,true);
        int curr_level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(curr_level==k){
                break;
            }
            curr_level++;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null&&vis.get(node.left)==null){
                    q.add(node.left);
                    vis.put(node.left,true);
                }
                if(node.right!=null&&vis.get(node.right)==null){
                    q.add(node.right);
                    vis.put(node.right,true);
                }
                if(hm.get(node)!=null&&vis.get(hm.get(node))==null){
                    q.add(hm.get(node));
                    vis.put(hm.get(node),true);
                }
            }
            
        }
        List<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            res.add(curr.val);            
        }
        return res;
    }
}
