//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/vertical-order-of-tree

import java.io.*;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class Main {
    static TreeNode makeBST(int arr[]){
        TreeNode root=null;
        for(int i:arr){
            root=inserttoBST(i,root);
        }
        return root;
    }
    static TreeNode inserttoBST(int val,TreeNode root){
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val<val){
            root.right=inserttoBST(val,root.right);
        }
        if(root.val>val){
            root.left=inserttoBST(val,root.left);
        }
        return root;
    }
    
    static void VerticalOrder(TreeNode root){
        TreeMap<Integer,ArrayList<Integer>>hm=new TreeMap<>();
        int level=0;
        traverseTree(root,hm,level);
        printTree(root,hm);
    }
     static void traverseTree(TreeNode root,TreeMap<Integer,ArrayList<Integer>>hm,int level){
        if(root==null) return ;
        hm.putIfAbsent(level,new ArrayList<>());
        hm.get(level).add(root.val);
        traverseTree(root.left,hm,level-1);
        traverseTree(root.right,hm,level+1);
    }
    static void printTree(TreeNode root,TreeMap<Integer,ArrayList<Integer>>hm){
        for(Map.Entry<Integer,ArrayList<Integer>> entry:hm.entrySet()){
            // System.out.println(entry.getKey());
            Collections.sort(entry.getValue());
            for(int val:entry.getValue()){
                System.out.print(val+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            TreeNode BSTtree=makeBST(arr);
            VerticalOrder(BSTtree);
        }
    }
}
