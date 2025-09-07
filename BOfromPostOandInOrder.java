//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

class Solution {
    TreeNode constructTree(int []postorder,int i1,int j1,int[] inorder,int i2,int j2,HashMap<Integer,Integer>hm){
        if(j1<i1||j2<i2)    return null;
 
        TreeNode root=new TreeNode(postorder[j1]);
        int idx=hm.get(root.val);
        int length=idx-i2;
        root.left=constructTree(postorder,i1,i1+length-1,inorder,i2,idx-1,hm);
        root.right=constructTree(postorder,i1+length,j1-1,inorder,idx+1,j2,hm);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return constructTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,hm);
    }
}
