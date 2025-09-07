//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        String ans="";
        if(root==null)  return ans;
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                ans += "#,";
                continue;
            }
            ans += curr.val + ",";
            q.add(curr.left);
            q.add(curr.right);
        }

        if (ans != null && ans.length() > 0) 
            ans = ans.substring(0, ans.length()-1);
        System.out.println(ans);
        return ans;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))  return null;
        Queue<TreeNode>q=new LinkedList<>();
        String values[]=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for(int i=1;i<values.length;i++){
            TreeNode parent=q.poll();
            if(!values[i].equals("#")){
                parent.left=new TreeNode(Integer.parseInt(values[i]));
                q.add(parent.left);
            }
            if(!values[++i].equals("#")){
                parent.right=new TreeNode(Integer.parseInt(values[i]));
                q.add(parent.right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
