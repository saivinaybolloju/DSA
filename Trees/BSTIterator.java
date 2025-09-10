//https://leetcode.com/problems/binary-search-tree-iterator/

class BSTIterator {
    Stack<TreeNode>st=new Stack<>();
    public BSTIterator(TreeNode root) {
        while(root!=null){
                st.push(root);
                root=root.left;
        }
    }
    
    public int next() {
        TreeNode node=st.pop();
        int ans=node.val;
        node=node.right;
        while(node!=null){
            st.push(node);
            node=node.left;
        }
        return ans;

    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
